# Clean-architecture
This Project for how to use  MVVM , state flow, Retrofit, dagger hit, coroutine , use cases with Clean architecture.


# Why i should use an Architecture
- All architectures have one common goal — to manage the complexity of your application. You may not need to worry about it on a smaller project, but it becomes a lifesaver on larger ones.

## How does Clean Architecture approach the problem?
- You might have seen this graph already:

- <img src="https://user-images.githubusercontent.com/62241386/180656187-7608a0d9-90a2-4736-add6-52e545e106e0.png" width="500" >&nbsp; 

### The circles represent different levels of software in your app. There are two key things to note:
- The center circle is the most abstract, and the outer circle is the most concrete. This is called the Abstraction Principle. The Abstraction Principle specifies that   inner circles should contain business logic, and outer circles should contain implementation details.
- Another principle of Clean Architecture is the Dependency Rule. This rule specifies that each circle can depend only on the nearest inward circle — this is what       makes the architecture work.



  

