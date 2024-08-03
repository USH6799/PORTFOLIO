const rotate = () => {
    let img = document.querySelectorAll("main>img");
    let heading = document.querySelector("h1");
    document.addEventListener("mousemove" , (dets) => {
        // console.log(this.innerHeight)
        // console.log(this.innerWidth)
        let area = this.innerWidth / 2 / dets.clientX;

        
        if(area >= 1 && area <= 10){
            let vision = 1 / area;
            let opc = Math.max(0.1 , Math.min(0.6 , vision))
            console.log(opc);
            for(let i = 0 ; i < img.length ; i++){
                img[i].style.transform = `translate(-50% , -50%) rotate(-${area*(img.length - 1 - i)}deg)`;
                img[i].style.opacity = opc;
            }
            
            heading.style.transform = `rotate(${area * 0.3}deg)`;
        }
        
        else if(area <= 1 && area > 0){
            let vision = ((this.innerWidth - dets.clientX) * 2) / this.innerWidth;
            let opc = Math.max(0.1 , Math.min(0.6 , vision))
            
            console.log(opc);
            for(let i = 0 ; i < img.length ; i++){
                img[i].style.transform = `translate(-50% , -50%) rotate(${(dets.clientX / this.innerWidth) * 10 * (img.length - 1 - i)}deg)`;
                img[i].style.opacity = opc;
            }
            heading.style.transform = `rotate(-${(dets.clientX / this.innerWidth) * 2}deg)`;
            
        }

        else{
            
        }
    })
}

const animate = () => {

    let tl = gsap.timeline();

    tl.from("main" , {
        rotate: 360,
        scale: 0.01,
        duration: 2,
    })

    tl.from("nav" , {
        opacity: 0,
        duration: 2,
    })

    tl.from(".left" , {
        opacity: 0,
        x: -1000,
        scale: 0.25,
        duration: 0.5,
        stagger: 0.2
    } , "h")

    tl.from(".right" , {
        opacity: 0,
        x: 1000,
        scale: 0.25,
        duration: 0.5,
        stagger: 0.2
    } , "h")
    
}


animate();
rotate();

