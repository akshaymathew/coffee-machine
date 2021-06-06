# Coffe machine
A beverage vending machine which can server parallely multiple drink

## Prerequisites
* Ubuntu LTS (either 16.04 or 18.04)/ Windows 10
* Latest version of JDK (download from [here](https://www.oracle.com/in/java/technologies/javase/jdk12-archive-downloads.html))

## Problem Statement
There are multiple ingredients that can be reused to serve different drink. Design and code an application to serve at max `n` drinks in parallel where `n` is the number of outlets 
## Approach

**Model**
    - Use Decorator design pattern to faciliate class reusability and minimum changes if and when new varations of drinks are introduced in the market
    - Elaichi Tea, Ginger tea, Green tea are all variations of tea. So, we can compose these new drink with a base Tea class.
    - Use synchronized methods to serve beverages concurrently.
**CoffeeMachineApplication**
    - A classs with the following methods<br />
        - `public Map<Ingredient,Integer> getIngredient()`<br />
        - `public void putIngredient(Ingredient ingredient, int quantity)`<br />
        - `public void getBeverage(Beverage beverage)`<br />
        - `private boolean checkDispatch(Beverage beverage)`<br />

## Installing dependencies for the application
Open terminal in the `\BeverageMachine` directory of this project and run the command `mvn clean install`.

## Running tests
Code smells can be identified using SonarLint. It's avaiableas a plugin to IntelliJ IDE. The unit tests are available in `\BeverageMachine\src\test\java\org\example` folder. Execute the tests one by one. So open the command prompt and run these commands one by one from the root directory<br />
    - `mvn clean install`<br />
    - `mvn test -Dtest=TwoOutletsTest#serveTwoBeverages test`<br />
    - `mvn test -Dtest=ThreeOutletsTest#serveThreeBeverages test`<br />
    - `mvn test -Dtest=FourOutletsTest#serveFourBeverages test`<br />
    
## Input
The test classes have the input for initial quauntity of ingredients. The individual beverage classes contain in turn the exact quantity of each of its ingredient. For this demonstration, the initial input amount for ingredients is :<br />
    - **HOT_WATER**,500ml<br />
    - **HOT_MILK**,500ml<br />
     - **GINGER_SYRUP**,100ml<br />
        - **SUGAR_SYRUP**,100ml<br />
      - **GREEN_MIXTURE**,50ml<br />
    - **TEA_LEAVES_SYRUP**,100ml<br />
    This initial amount is avaiable in the test classes
    
The amount of ingredients for each beverage is <br />
    - **HOT_TEA**: `{HOT_MILK: 100ml, HOT_WATER:200 ml, SUGAR_SYRUP: 10ml,TEA_LEAVES_SYRUP: 30ml}`<br />
    - **HOT_MILK** - `{HOT_MILK:50 ml}`<br />
    - **GINGER_TEA** - `{HOT_MILK: 100ml, HOT_WATER:200 ml, SUGAR_SYRUP: 10ml,TEA_LEAVES_SYRUP: 30ml, GINGER_SYRUP: 10 ml}`<br />
    - **BLACK_TEA** - `{HOT_WATER:300 ml, SUGAR_SYRUP: 50ml, GINGER_SYRUP: 30 ml, TEA_LEAVES_SYRUP: 30ml}`<br />
    - **GREEN_TEA** - `{HOT_WATER:100 ml, SUGAR_SYRUP: 50ml, GINGER_SYRUP: 30 ml, GREEN_MIXTURE: 30ml}`<br />
    Note: All quantities are in milli-litre. Similarly other beverages have their ingredients' amount defined in the class
## Authors/Acknowledgements
@author : Akshay Mathew (akshaymathew20@gmail.com)

