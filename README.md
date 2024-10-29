## Learning Concurrency Core Principles
Course and Images by Simon Roberts on Oreilly ! - [LINK](https://learning.oreilly.com/live-events/concurrent-programming-core-concepts/0642572008523/)


# Context Swtiching
When one task is blocked computer can switch to another task and comeback later to the previous task
We need context swtiching when switching between tasks.
While context swtiching
- Where we left off?
- Whats happening right now with the task

![Alt text](./context_switching.png?raw=true "Context Switching")


In computers, only registes (ALU) can perform calculations meanwhile memory ad cache only stores/reads values.


Volatile in Java
- 
When we declare a variable as volatile, its value is always loaded from memory whenever we want to use it
![alt text](./volatile.png?raw=true)
