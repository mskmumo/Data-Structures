Differentiate between arrays and linked lists in terms of:
            1. Memory Allocation
Arrays

Contiguous Memory: Arrays store elements in a single, continuous block of memory.
Static or Dynamic: In many languages, arrays have a fixed size determined at compile time, or use dynamic resizing (as in dynamic arrays) but still require contiguous space.
Implications:
Fast Index Calculation: Since the memory is contiguous, the address of any element can be computed quickly.
Potential Wastage/Fragmentation: Allocating a large contiguous block may be challenging if memory is fragmented, and an incorrect size choice can waste memory.

Linked Lists

Non-Contiguous Memory: Each node in a linked list is allocated separately, often scattered throughout memory.
Dynamic Allocation: Nodes are allocated as needed at runtime.
Implications:
Flexible Size: The list can grow or shrink dynamically without needing a large contiguous block.
Extra Overhead: Each node stores not only the data but also one or more pointers (or links), which increases memory usage.

2. Performance

Access Speed:

Arrays:
O(1) Random Access: You can directly access any element by its index using arithmetic, which is very fast and cache-friendly.

Linked Lists:
O(n) Sequential Access: To access the nth element, you must traverse the list from the head, leading to slower access times and poor cache locality.


Cache Performance:

Arrays:
The contiguous layout means that when one element is accessed, adjacent elements are likely loaded into the CPU cache, improving performance for iterations.

Linked Lists:
Because nodes can be scattered in memory, they are less cache-friendly, potentially slowing down iteration and traversal.

3. Insertion and Deletion Operations

Arrays:

Insertion/Deletion Complexity:
Middle Insertions/Deletions: When inserting or deleting an element in the middle, you typically need to shift all subsequent elements. This results in O(n) time complexity in the worst case.
End Operations: In dynamic arrays, appending can be O(1) amortized if there is reserved space, but can become O(n) if the array needs to be resized.
Example:
To insert an element at index 5, elements from index 5 onward must be shifted one position to the right.

Linked Lists:

Insertion/Deletion Complexity:
With Direct Reference: If you already have a pointer/reference to the node where insertion or deletion is to occur, these operations can be performed in O(1) time—only a few pointer updates are required.
Without Direct Reference: If the location must be found first, the traversal takes O(n) time.
Example:
To insert an element at the 5th position, you traverse the list to the node at index 4, then adjust pointers to link in the new node.