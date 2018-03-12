# FTSM-GCafe
Lab Exercise 2: Object, Composite Object and ArrayList

This lab test is divided into FOUR stages – Stage 1, Stage 2, Stage 3 and Stage 4. 
You need to complete prior stages without errors before you can proceed to the respective
next stages. 
To do this lab test you are provided with five files – Tester1.java, Tester2.java,
Tester3.java, and Tester4.java.
Before you start, you need to do the following:

1. Create a folder on Desktop and name the folder using your matric number.

2. Open eclipse and set the folder named using your matric number as your workspace.Problem Background

UKM is conducting a survey on what type of beverages sold in all cafeterias. As a part time barista
in FTSM Garden Café, you are given a task to collect data on nutritional information of these
beverages. You must also find out beverage with the lowest calories intake. You plan to develop
a program which is able to manage data for these cafeterias.

The general structure of objects involved are as follows:

The attributes for Beverage are country of origin, brand, name, vegan friendly status
(true/false), quantity per pack, price per pack and nutritional information (which is an
object).

The attributes for NutrionalInfo are energy (Cal), fat content (g), carbohydrate (g), fibre (g), protein (g) and sodium (mg).

The attributes for Cafe are name, address, the number of barista hired, and a list of
beverages sold.

The attributes for CafeList is a list of Café.

## Stage 1

Therefore, the first thing that you need to do is to define a class to create an object of a Beverage:

1. Create a Java project named Lab2-B-Stage1.

2. Copy class Tester1.java into your project.

3. Write class definition for the following classes:

Define a class named NutrionalInfo (in file NutritionalInfo.java) that has:
Instance variables energy,
i.
fat,
carbohydrate,
fibre,
protein,
sodium.
ii.
Constructor method which receives six parameters in (i) and assigns them to the associated
instance variables.
iii.
Define public accessor method for all attributes.
Define a class named Beverage (in file Beverage.java) that has:
i.
Instance variables origin, brand, name,veganFriendly, pricePerPack,
quantityPerPack, and nutritionInfo (of type NutrionalInfo).ii.
Constructor method which receives seven parameters in (i) and assigns them to the
associated instance variables.
Define a class named Cafe (in file Cafe.java) that has:
i.
Instance variables name, address, noOfBarista, beverageList (to keep
an array list of Beverage).
ii.
Constructor method which receives the first three parameters in (i) and assigns them to the
associated instance variables, and creates an array list of Beverage and assign it to instance
variable beverageList.
iii.
Define accessor methods for all attributes.
Define a class named CafeList (in file CafeList.java) that has:
i. Instance variables to represent a list of Cafe, cafeList, an array list.
ii. Constructor method which create an array list cafeList to register Cafe objects.
iii. Define accessor method for its attribute.
Check your answer by invoking the main method in class Tester1 (just run project as Java
Application) and your output should be as follows:
Total number of cafe surveyed :3
Cafe's Name : FTSM Garden Cafe
Address : G1 BlockG, FTSM
No of barista : 2
Cafe's Name : Zarry Bakery & Cafe
Address : L1 Pusanika
No of barista : 3
Cafe's Name : DeZaaba Cafetaria
Address : Kolej Zaaba
No of barista : 5Stage 2
The program needs a feature to add a new beverage into the beverage list. Therefore, you need
to:
1. Create a Java project named Lab2-B-Stage2 .
2. Copy class Tester2.java, as well as NutritionaInfo.java, Beverage.java,
Cafe.java and CafeList.java
(from stage 2) into your project.
3. Add into class Cafe an accessor method which returns the beverageList.
Define a class named BeverageList (in file BeverageList.java) that has:
i. Instance variables to represent a list of Beverage, beverageList, an array list.
ii. Constructor method which create an array list beverageList to register Beverage
objects.
iii. Define accessor method for its attribute.
iv. Add definition for method addBeverage(Beverage b). The method should add
the received Beverage object at the end of the beverageList list.
4. Check your answer by invoking the main method in class Tester2, and your output should
be as follows:
Total number of cafe surveyed :3
Cafe's name: FTSM Garden Cafe
==============================
Beverage name : Caramel Latte
Brand : Moccona
Country of origin : Australia
Vegan status : true
Price per pack : 20.5
QuantityPerPack: 10
Beverage name : Cappucino Skim
Brand : Nescafe
Country of origin : New Zealand
Vegan status : true
Price per pack : 26.0
QuantityPerPack: 10
Cafe's name: Zarry Bakery & Cafe
==============================Beverage name : Cappucino Skim
Brand : Nescafe
Country of origin : New Zealand
Vegan status : true
Price per pack : 26.0
QuantityPerPack: 10
Beverage name : Italian Espresso
Brand : Robert Timms
Country of origin : Brazil
Vegan status : true
Price per pack : 16.0
QuantityPerPack: 8
Cafe's name: DeZaaba Cafetaria
==============================
Beverage name : Chai Tea Latte
Brand : Lipton
Country of origin : Australia
Vegan status : true
Price per pack : 22.5
QuantityPerPack: 10
Beverage name : Italian Espresso
Brand : Robert Timms
Country of origin : Brazil
Vegan status : true
Price per pack : 16.0
QuantityPerPack: 8
Stage 3
1. Create a Java project named Lab2-B-Stage3 .
2. Copy class Tester3.java, as well as NutritionaInfo.java, Beverage.java,
Cafe.java, CafeList.java and BeverageList.java (from stage 2) into your
project.
3. Add in class Cafe, method displayLowestCalory(ArrayList<Beverage>
bList to find the lowest beverage calories from the beverage list for each café.
4. Check your answer by invoking the main method in class Tester4, and your output should
be as follows:Lowest beverage calory in FTSM Garden Cafe :45.0
Lowest beverage calory in Zarry Bakery & Cafe :45.0
Lowest beverage calory in DeZaaba Cafetaria :5.0
Stage 4
1. Create a Java project named Lab2-B-Stage4 .
2. Copy class Tester4.java, as well as NutritionaInfo.java, Beverage.java,
Cafe.java, CafeList.java and BeverageList.java (from stage 3) into your
project.
3. Add in class Cafe, method displayTotalOrigin(ArrayList<Beverage>
bList) to find the total number of beverages which originate from Australia in the beverage
list for each cafe.
4. Check your answer by invoking the main method in class Tester4, and your output should
be as follows:
Lowest beverage calory in FTSM Garden Cafe :45.0
Total beverage from Australia in FTSM Garden Cafe :1
Lowest beverage calory in Zarry Bakery & Cafe :45.0
Total beverage from Australia in Zarry Bakery & Cafe :2
Lowest beverage calory in DeZaaba Cafetaria :5.0
Total beverage from Australia in DeZaaba Cafetaria :2
