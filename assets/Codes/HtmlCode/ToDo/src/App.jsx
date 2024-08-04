import { useEffect, useState } from "react";
import "./App.css";
import Nav from "./Components/nav";
import { v4 as uuidv4 } from "uuid";
import { FiEdit3 } from "react-icons/fi";
import { IoTrashBinOutline } from "react-icons/io5";
import { MdKeyboardReturn, MdOutlineDataSaverOn } from "react-icons/md";
import { FcHighPriority } from "react-icons/fc";
import { FcMediumPriority } from "react-icons/fc";
import { FcLowPriority } from "react-icons/fc";

const priorities = {
	HIGH: "High",
	MEDIUM: "Medium",
	LOW: "Low",
};

const priorityOrder = {
	High: 1,
	Medium: 2,
	Low: 3,
};

function App() {
	const [todo, settodo] = useState("");
	const [list, setlist] = useState([]);

	const CheckKey = () => {
		
	}

	
	useEffect(() => {
	
		const savedTodos = localStorage.getItem("todos");
		if (savedTodos) {
			setlist(JSON.parse(savedTodos));
		}
	}, []);

	useEffect(() => {
		localStorage.setItem("todos", JSON.stringify(list));
	}, [list]);

	const handleDragStart = (e, priority) => {
		e.dataTransfer.setData("priority", priority);
	};

	const handleDrop = (e, id) => {
		const priority = e.dataTransfer.getData("priority");
		const updatedTodos = list.map((todo) =>
			todo.id === id ? { ...todo, priority } : todo
		);
		setlist(sortTodos(updatedTodos));
	};

	const handleDragOver = (e) => {
		e.preventDefault();
	};

	const sortTodos = (todos) => {
		return todos.sort(
			(a, b) => priorityOrder[a.priority] - priorityOrder[b.priority]
		);
	};

	const Add = () => {
		const newTodo = {
			id: uuidv4(),
			todo,
			isCompleted: false,
			priority: priorities.LOW,
		};
		const updatedList = [newTodo, ...list];
		setlist(sortTodos(updatedList));
		settodo("");
	};

	const Edit = (e) => {
		settodo(
			e.target.closest('.task').querySelector('h3').innerText
		);
		let id = e.target.closest('.task').querySelector('h3').id;
		let NewTodos = list.filter((item) => item.id !== id);
		setlist(NewTodos);
	};
	
	const Delete = (e) => {
		let id = e.target.closest('.task').querySelector('h3').id;
		let NewTodos = list.filter((item) => item.id !== id);
		setlist(NewTodos);
	};

	const TakeInput = (e) => {
		settodo(e.target.value);
	};

	const CheckState = (e) => {
		let id = e.target.id;
		let i = list.findIndex((item) => item.id === id);
		let NewTodos = [...list];
		NewTodos[i].isCompleted = !NewTodos[i].isCompleted;
		setlist(NewTodos);
	};

	return (
		<div className=" min-h-screen w-screen relative flex flex-col justify-start items-center bg-zinc-950  overflow-hidden">
			<Nav />
			<div className="main flex flex-col justify-start gap-6 text-white items-center px-4 lg:px-32 sm:px-8 md:px-12 py-6 bg-zinc-900 m-16 lg:w-2/3 sm:w-[90%] md:w-3/4 w-[90%] h-fit rounded-lg relative">
				<h1 className="text-[2rem] font-bold text-slate-200 mb-5">
					iTask - Do Your Do's
				</h1>
				<div className="input flex justify-between gap-2 flex-col sm:flex-row md:flex-row lg:flex-row items-center w-full relative pb-6">
					<input
						type="text"
						className="lg:w-[6.5rem] md:w-[8rem] w-[100%] px-3 py-1 text-[18px] 
            font-semibold rounded-xl text-white 
            focus:w-full 
            hover:rounded-none 
            hover:border-t-0 
            hover:border-r-0 
            hover:border-l-0 
            focus:border-t-0 
            focus:border-r-0 
            focus:border-l-0 
            focus:border-b-2
            focus:rounded-none
            focus:outline-none
            focus:px-0
            ease-in duration-300 border-2 border-b-white bg-transparent placeholder:text-sm"
						placeholder="Task Here..."
						onFocus={(e) => {
							e.target.placeholder = "Enter Your Task Here...";
							e.target.addEventListener("focusout", () => {
								e.target.placeholder = "Task Here...";
							});
						}}
						onChange={TakeInput}	
						value={todo}
						/>
					<button
						className="text-md font-bold sm:p-2 px-10 py-1 bg-slate-600 rounded-2xl ml-10 hover:bg-slate-700 hover:scale-110 hover:uppercase ease-in-out duration-300 disabled:scale-100"
						onClick={Add}
						disabled={todo.length < 1}
					>
						<MdOutlineDataSaverOn className="text-2xl"/>
					</button>
				</div>

				<div className="priority-boxes hidden gap-4 lg:flex md:flex">
					<div
						className="priority-box high p-2 rounded-lg cursor-pointer"
						draggable
						onDragStart={(e) => handleDragStart(e, priorities.HIGH)}
					>
						<FcHighPriority className="text-3xl"/>
					</div>
					<div
						className="priority-box medium p-2 rounded-lg cursor-pointer "
						draggable
						onDragStart={(e) =>
							handleDragStart(e, priorities.MEDIUM)
						}
					>
					<FcMediumPriority className="text-3xl"/>
					</div>
					<div
						className="priority-box low p-2 rounded-lg cursor-pointer"
						draggable
						onDragStart={(e) => handleDragStart(e, priorities.LOW)}
					>
					<FcLowPriority className="text-3xl"/>
					</div>
				</div>

				{list.map((item) => (
					<div
						key={item.id}
						className={`task min-h-[3rem] w-full rounded-lg text-[1.2rem] font-semibold flex items-center justify-between px-4 py-2 ${item.priority.toLowerCase()}`}
						onDrop={(e) => handleDrop(e, item.id)}
						onDragOver={handleDragOver}
					>
						<h3
							className={
								item.isCompleted
									? "line-through decoration-2 decoration-black text-gray-200 w-[70%] md:w-[80%] lg:w-[80%] lg:h-[50%] break-words"
									: "text-gray-200 w-[70%] md:w-[80%] lg:w-[80%] lg:h-[50%] break-words"
							}
							onClick={CheckState}
							id={item.id}
						>
							{item.todo}
						</h3>


						<div className="opt flex items-center justify-between gap-2">
							<button
								className="bg-zinc-900 p-2 rounded-xl flex text-center opacity-70 hover:opacity-100 justify-center ease duration-200"
								onClick={Edit}
							>
								<FiEdit3 />
							</button>
							<button
								className="bg-zinc-900 p-2 rounded-xl flex text-center opacity-70 hover:opacity-100 ease duration-200"
								onClick={Delete}
							>
								<IoTrashBinOutline />
							</button>
						</div>
					</div>
				))}
			</div>
		</div>
	);
}

export default App;
