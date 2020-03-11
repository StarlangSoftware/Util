# Util
For Developers
============
You can also see either [Python](https://github.com/olcaytaner/Util-Py) 
or [C++](https://github.com/olcaytaner/Util-CPP) repository.
## Requirements

* [Java Development Kit 8 or higher](#java), Open JDK or Oracle JDK
* [Maven](#maven)
* [Git](#git)

### Java 

To check if you have a compatible version of Java installed, use the following command:

    java -version
    
If you don't have a compatible version, you can download either [Oracle JDK](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) or [OpenJDK](https://openjdk.java.net/install/)    

### Maven
To check if you have Maven installed, use the following command:

    mvn --version
    
To install Maven, you can follow the instructions [here](https://maven.apache.org/install.html).      

### Git

Install the [latest version of Git](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git).

## Download Code

In order to work on code, create a fork from GitHub page. 
Use Git for cloning the code to your local or below line for Ubuntu:

	git clone <your-fork-git-link>

A directory called Util will be created. Or you can use below link for exploring the code:

	git clone https://github.com/olcaytaner/Util.git

## Open project with IntelliJ IDEA

Steps for opening the cloned project:

* Start IDE
* Select **File | Open** from main menu
* Choose `Util/pom.xml` file
* Select open as project option
* Couple of seconds, dependencies with Maven will be downloaded. 


## Compile

**From IDE**

After being done with the downloading and Maven indexing, select **Build Project** option from **Build** menu. After compilation process, user can run Util.

**From Console**

Go to `Util` directory and compile with 

     mvn compile 

## Generating jar files

**From IDE**

Use `package` of 'Lifecycle' from maven window on the right and from `Util` root module.

**From Console**

Use below line to generate jar file:

     mvn install



------------------------------------------------

Util
============
+ [Maven Usage](#maven-usage)
+ [Examples](#examples)


### Maven Usage

	<dependency>
  	<groupId>NlpToolkit</groupId>
  	<artifactId>Util</artifactId>
  	<version>1.0.0</version>
	</dependency>

### Examples


 * Tuple
 
 	One Tuple consist of two integer number First and Last respectively.
	
         Tuple tuple = new Tuple(1,4);
 * Interval
 
 	Creating an Interval and adding tuples with given integers First and Last respectively.
 	 
          Interval interval = new Interval();
	   interval.add(1,2);
	   interval.add(3,5);
	   interval.add(5,2);
	   
	The first element at the list with interval's given index.
	  
	   System.out.println(interval.getFirst(1));
	   System.out.println(interval.getLast(2));
	   
	Output
	
	   First Element of Index 1 : 3
	   Last Element of Index 2  : 2
	   
 * RandomNormalizedArray
 	
	Gets an integer itemCount as an input. Creates an array of size itemCount and loops through each element of the array and initializes them with a random number, at the end each array element divided to sum.
	
	Creates a double array as a size of 3 and divide each element to sum.
	 
	   RandomNormalizedArray randomNormalizedArray = new RandomNormalizedArray(3);
	   printDoubleArray(randomNormalizedArray.get());
	   
	Output
	
	   0.4463255068168585,0.11337478842358989,0.4402997047595516
	   
     
 * Permutation
 
 	Creates an integer array 0 to given input which is 3.By using .get() method we can get the generated array.
	
	   Permutation permutation = new Permutation(3);
	   printIntegerArray(permutation.get());
	   
	Output
	   
	   0,1,2
	   
	 All permutations of array.
	
	   while(permutation.next()!=false){
	   permutation.next();
	   printIntegerArray(permutation.get());
           }
	   
	Output
	
	   1. [0][1][2]
          2. [1][0][2]
          3. [2][0][1]
          4. [2][1][0]
	   
 
  * SubsetFromList
         
	 Creates subsets from given integer array with given element count which in this case is 3.
	    
	    int[] arrayList = {5,21,0,9,5,3};
	    SubsetFromList subsetFromList = new SubsetFromList(arrayList,3);
	 
	 Using .set() method we can get the current set and using .next() will create new subsets.
	  
	    while (subsetFromList.next()!=false){
            subsetFromList.next();
            printIntegerArray(subsetFromList.set);
            }
   	 
	 Output
	 
	    [5][21][5]
	    [5][0][9]
            [5][0][3]
            [5][9][3]
            [21][0][9]
            [21][0][3]
            [21][9][3]
            [0][9][5]
            [0][5][3]
            [9][5][3]
	   
	   
          
