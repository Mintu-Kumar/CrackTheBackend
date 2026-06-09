Problem Statement -  What is difference between Iterator and SplitIterator.
                     Explain with an example.

Iterator:

       1. It is cursor, Collection framework has 3 cursor , Enumeration,
            Iterator and ListIterator
       2. it is also called universal Iterator
       3. It provides only forward traversal
       4. it has 3 method hasNext(), next(), remove()
       5. it is for Sequential processing


Spliterator:

       1. Spliterator in java is special type Iterator that traverse element
            and split into part for parallel procession.
       2. It also provides only forward traversal
       3. It divides a collection into two parts using trySplit().
       4. It is designed to work with parallel stream
       5. If splitting is not possible (e.g., very small data set), it returns null.