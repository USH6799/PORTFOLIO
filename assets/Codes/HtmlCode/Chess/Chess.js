const express = require("express");
const socket = require("socket.io");
const http = require("socket.io")
const {Chess} = require("chess.js");
const path = require("path");
const { title } = require("process");

const app = express();

const server = http.createServer(app);

const io = socket(server);

const chess = new Chess();

let players = {};
let current = "W";


app.set("view enginer", "ejs");

app.use(express.static(path.join(__dirname , "public")));

app.get("/" , (req , res) => {
    res.render('index' , {title:"UrChess.com"});
})

server.listen(3000 , function(){
    console.log("Server is Listening");
})