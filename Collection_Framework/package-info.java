/**
 * 
 */
/**
 * @author Gaurav Jha
 *
 */
package Collection_Framework;
//JAVA COLLECTION FRAMEWORK Interface is the root interface of the collections framework  hierarchy.
//Java does not provide direct implementations of the collection
//interface but provides implementations of its sub-interfaces like LIST,SET and QUEUE.
//
//METHODS:-
//add(),size(),remove(),iterator(),addAll(),removeAll(),clear().
//
//[1].LIST:-In Java,It is an ordered collection that allows us to store and access elements sequentially.
            //It extends the Collection Interface.We cannot create object of it.
            //In order to use functionalities of List Interface,we can use these classes:-
//       
           //*ArrayList
           //*LinkedList
           //*Vector
           //*Stack
//
//
//[2].SET:-In Java,It provides the features of mathematical set in Java.
           //It extends the Collection Interface.Unlike the List Interface,sets cannot contain duplicate elements.
           //In order to use functionalities of Set Interface,we can use these classes:-
//
           //*EnumSet
           //*HashSet
           //*LinkedHashSet
           //*TreeSet
//
//
//[3].QUEUE:-In Java,It provides the functionalities of the Queue Data Structure.
             //It extends the Collection Interface.
             //In order to use functionalities of Queue Interface,we need to use these classes that implement it:-
//
             //*ArrayQueue
             //*LinkedList
             //*PriorityQueue
//
//
//[**]MAP INTERFACE:-It provides the functionalities of Map Data Structure.
                     //In order to use functionalities of Map Interface,we can use these classes:-
//
                     //*HashMap
                     //*EnumMap
                     //*LinkedHashMap
                     //*WeakHashMap
                     //*TreeMap