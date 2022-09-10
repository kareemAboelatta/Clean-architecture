# Clean-architecture
This Project for how to use  MVVM , state flow, Retrofit, dagger hit, coroutine , use cases with Clean architecture.





## Why i should use an Architecture
- All architectures have one common goal — to manage the complexity of your application. You may not need to worry about it on a smaller project, but it becomes a lifesaver on larger ones.

## How does Clean Architecture approach the problem?
- You might have seen this graph already:

<img src="https://user-images.githubusercontent.com/62241386/180656187-7608a0d9-90a2-4736-add6-52e545e106e0.png" width="500" >&nbsp; 

### The circles represent different levels of software in your app. There are two key things to note:
- The center circle is the most abstract, and the outer circle is the most concrete. This is called the Abstraction Principle. The Abstraction Principle specifies that   inner circles should contain business logic, and outer circles should contain implementation details.
- Another principle of Clean Architecture is the Dependency Rule. This rule specifies that each circle can depend only on the nearest inward circle — this is what       makes the architecture work.

##### The outer circle represents the concrete mechanisms that are specific to the platform such as networking and database access. Moving inward, each circle is more abstract and higher-level. The center circle is the most abstract and contains business logic, which doesn’t rely on the platform or the framework you’re using.

### Additional benefits of using an architecture when structuring app code include :
 - Parts of the code get decoupled, and easier to reuse and test.
 - There’s a method to the madness. When someone else works on your code, they can learn the app’s architecture and will understand it better.

## SOLID Principles
### Five design principles make software design more understandable, flexible and maintainable. Those principles are:
- [x] Single Responsibility: Each software component should have only one reason to change – one responsibility.
- [x] Open-closed: You should be able to extend the behavior of a component, without breaking its usage, or modifying its extensions.
- [x] Liskov Substitution: If you have a class of one type, and any subclasses of that class, you should be able to represent the base class usage with the subclass, without breaking the app.
- [x] Interface Segregation: It’s better to have many smaller interfaces than a large one, to prevent the class from implementing the methods that it doesn’t need.
- [x] Dependency Inversion: Components should depend on abstractions rather than concrete implementations. Also higher level modules shouldn’t depend on lower level modules.

### Clean Architecture maximizes the use of these principles.


## Layers of Clean Architecture
###  There are different opinions about how many layers Clean Architecture should have. The architecture doesn’t define exact layers but instead lays out the foundation. The idea is that you adapt the number of layers to your needs.

### To keep things simple, you’ll use five layers:
- Presentation: A layer that interacts with the UI.
- Use cases: Sometimes called interactors. Defines actions the user can trigger e.g(get Profile data).
- Domain: Contains the business logic of the app.
- Data: Abstract definition of all the data sources.
- Framework: Implements interaction with the Android SDK and provides concrete implementations for the data layer.

<img src="https://user-images.githubusercontent.com/62241386/180656189-dbea8dd8-e89d-413e-ba5a-83206c971ed5.png" width="500" >&nbsp; 

### Green layers depend on Android SDK.


## To know Project Structure see this repo which is this readMe file is owned by it. 










  

