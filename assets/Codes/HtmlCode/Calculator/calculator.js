let body = document.querySelector('.container');
let input = document.querySelector('input');

let result = "";

let btn = document.querySelectorAll('button');
// let res = document.querySelector('.equ');

btn.forEach(elem => {

    elem.addEventListener('click' , (ev) => {
        if(elem.innerHTML == '='){
            console.log('hello');
            result = eval(result);
            console.log(result);
        }

        else{
            if(elem.innerHTML == 'X'){
                result += '*';
            }

            else if(elem.innerHTML == 'DEL'){
                result = String.toString(result).substring(0 , result.length - 1);
            }

            else if(elem.innerHTML == 'AC'){
                result = '';
            }

            else{
                result += elem.innerHTML;
            }

        }

        input.value = result;
    })
})

