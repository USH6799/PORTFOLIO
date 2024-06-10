document.addEventListener("DOMContentLoaded", function() {
    const form = document.getElementById("feedbackForm");
    const submitBtn = document.getElementById("submitBtn");

    form.addEventListener("submit", function(event) {
        event.preventDefault(); // Prevent default form submission
        
        // Get form data
        const formData = new FormData(form);
        const feedbackData = {
            name: formData.get("name"),
            email: formData.get("email"),
            message: formData.get("message")
        };

        // Simulate submission (replace this with actual submission code)
        console.log("Feedback Submitted:", feedbackData);
        alert("Feedback submitted successfully!");
        
        // Clear form fields
        form.reset();
    });
});
