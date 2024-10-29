# Learning Concurrency Core Principles
Course and Images by Simon Roberts on Oreilly ! - [LINK](https://learning.oreilly.com/live-events/concurrent-programming-core-concepts/0642572008523/)

## Analogy used for below Concepts
Imagine a cpu as a human working in a corporate working on multiple tasks. 


Context Swtiching
-
When one task is blocked computer can switch to another task and comeback later to the previous task
We need context swtiching when switching between tasks.
While context swtiching
- Where we left off?
- Whats happening right now with the task

w.r.t analogy, every task's status are written on a small notebook that human can use while switching between tasks to checkup on where did they left off and current status

![Alt text](./context_switching.png?raw=true "Context Switching")


In computers, only registes (ALU) can perform calculations meanwhile memory ad cache only stores/reads values.


Volatile in Java
- 
When we declare a variable as volatile, its value is always loaded from memory whenever we want to use it
![alt text](./volatile.png?raw=true)


Parellelism
-
When we have parallel hardware (multiple cpu)  each cpu can take up on 1 task at a point. These type of systems would be "used" most effeciently when the no of "independent" tasks to be executed are more than the no of cpus.

While executing same lengthy task by multiple threads we can get into problems and must do it properly 
In the lengthy depdendant when a data is only read and never changed, it is okay to do it as is.
When same piece of data is changed by multiple threads it can cause weird results and must be done in a proper way.

