document.addEventListener('DOMContentLoaded', function() {
    // Select all arrow icons
    const arrows = document.querySelectorAll('.ri-arrow-down-s-line');

    // Loop through each arrow icon
    arrows.forEach(arrow => {
        // Add click event listener to each arrow
        arrow.addEventListener('click', function() {
            // Toggle the display of .code element
            const codeElement = this.parentElement.nextElementSibling;
            toggleCode(codeElement, this);
        });
    });

    // Function to toggle the display of .code element with animation
    function toggleCode(codeElement, arrow) {
        if (codeElement.style.display === 'none' || codeElement.style.display === '') {
            // Set initial height to 0
            codeElement.style.height = '0';
            codeElement.style.opacity = 0;
            codeElement.style.display = 'block';
            // Animate the display of the .code element
            gsap.to(codeElement, { height: 'auto', opacity: 1, duration: 0.5, ease: 'power2.inOut' });
            gsap.to(arrow, { rotation: 180, duration: 0.5 }); // Rotate the arrow icon
        } else {
            // Animate the hiding of the .code element
            gsap.to(codeElement, { height: 0, opacity: 0, duration: 0.5, ease: 'power2.inOut', onComplete: () => codeElement.style.display = 'none' });
            gsap.to(arrow, { rotation: 0, duration: 0.5 }); // Rotate the arrow icon back
        }
    }

    // Header animation
    const header = document.querySelector('.upper');
    gsap.from(header, { y: -100, opacity: 0, duration: 1, delay: 0.5 });

    // Homepage button animation
    const homepageBtn = document.getElementById('homepage-btn');
    gsap.from(homepageBtn, { x: 100, opacity: 0, duration: 1, delay: 0.8 });
});

