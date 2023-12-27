// Constants declared for input button and task list area
const taskInput = document.querySelector("#taskInput");
const taskSection = document.querySelector('#tasks');

// Listener for the Enter key. Used to add a new task.
taskInput.addEventListener("keyup", (e) => {
    if (e.key === "Enter") {
        createTask();
    }
});

// The onclick event for the "Add" button. Used to add a new task.
document.querySelector('#Push').onclick = function () {
    createTask();
};

// Add event listener to the taskSection for delegation
taskSection.addEventListener('click', function (event) {
    if (event.target.classList.contains('delete')) {
        event.target.parentNode.remove();
    } else if (event.target.classList.contains('checkbox')) {
        updateTask(event.target);
    }
});

// The function that creates a task
function createTask() {
    if (taskInput.value.length === 0) {
        alert("The task field is blank. Enter a task name and try again.");
    } else {
        // This block inserts HTML that creates each task into the task area div element
        taskSection.innerHTML += `
            <div class="task">
                <label id="taskname">
                    <input type="checkbox" class="checkbox">
                    <p>${taskInput.value}</p>
                </label>
                <div class="delete">
                    <i class="uil uil-trash"></i>
                </div>
            </div>`;
    }
}

// Function to update task status
function updateTask(checkbox) {
    let taskItem = checkbox.closest('.task').querySelector('p');
    taskItem.classList.toggle('checked');
}