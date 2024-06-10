var scr = document.querySelector(".screen #btn");
var screen = document.querySelector(".screen");
var score = 0;
var timer = 60;
var hit;
var counter = 0;

function MakeBubble(){
    var c = 18;
    var width = this.outerWidth;
if(width <= 600){
    // console.log("ehel");
    c = 5;
}
    var col = "";
for(var i = 1 ; i <= c ; i++){
    var row = "";
    col += `<div class="col"></div>`
    }
    document.querySelector(".btm").innerHTML = col;

    
    document.querySelectorAll(".col").forEach(function (elem) {
        row = "";
        for (let j = 1; j < 12; j++) {
            var a = Math.ceil(Math.random() * 9); 
            row += `<div class="bubble">${a}</div>`;
        }
        elem.innerHTML = row;
    });
}

function GetNewHit(){
    hit = Math.floor(Math.random() * 9) + 1;
    document.querySelector("#hit").textContent = hit;
}

function Runtimer(){
    // var timer = 60;
    var int = setInterval(function(){
        document.querySelector("#timer").textContent = timer;
        timer--;
        // GetNewHit();
        if(timer <= -1){
            document.querySelector(".result").style.display = "flex";
            clearInterval(int);
            document.querySelector("#timer").textContent = 0;

            document.querySelector("#box1").textContent = score;
            document.querySelector("#box2").textContent = counter;
            return;
        }
    }, 1000);
}

function incScore(){
    score += 10;
    document.querySelector("#score").textContent = score;
}

document.querySelector("#chtime").addEventListener("click" , function(dets){
    // document.querySelector("#chtime").style.display = "none";
    screen.style.display = "none";
    // scr.style.display = "flex";
    document.querySelector(".changetime").style.display = "flex";
    // scr.style.transform = "translateY(-110%)";
    // scr.style.z_index = "101";
})

document.querySelector(".a").addEventListener("click" , function (dets) {
    var t = Number(dets.target.textContent);
    if(t == 15 || t == 60 || t == 30 || t == 90){
        // console.log(t);
        timer = t;
    }
    
    document.querySelector("#timer").textContent = timer;
    // console.log(dets.target.textContent);
    
})

document.querySelector("#return").addEventListener("click" , function(){

    screen.style.display = "flex";
    document.querySelector(".changetime").style.display = "none";

})

document.querySelector(".btm").addEventListener("click" , function (dhdk) {
    var choice = Number(dhdk.target.textContent);
    if(choice == hit){
        counter ++;
        incScore();
        dhdk.target.style.transform = "scale(0.3)";
        setTimeout(function () {
            if(this.outerWidth <= 600){
                MakeBubble();
            }
            else{
                dhdk.target.style.display = 'none'; 
            }
        } , 10);
        GetNewHit();
    }

    else{
        if(score > 0){
            score -= 5;
            document.querySelector("#score").textContent = score;
        }
        else{

        }
    }
})


document.querySelector("#newhit").addEventListener("click" , function () {
    GetNewHit();
    timer -= 3;
})
var flag = 1;
scr.addEventListener("click" , function () {
    if(flag == 1){
        var sec = 3;
        var int1 = setInterval(function(){
        if(sec == 0){
            scr.innerHTML = `<h1>Enjoy!</h1>`;
        }
        else if(sec == -1){
            screen.style.display = "none";
            document.querySelector(".changetime").style.display = "none";
            Runtimer();
            clearInterval(int1);
            return;
        }
        else{
            scr.innerHTML = `<h1>${sec}</h1>`;
        }
        sec --;
        
    } , 1000); 
    } 
    flag = 0;

    return;
});

document.querySelector(".result a").addEventListener("click" , function(){
    flag = 1;
});

MakeBubble();
GetNewHit();
// incScore();

