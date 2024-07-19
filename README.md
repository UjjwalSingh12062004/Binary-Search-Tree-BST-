Binary Search Tree (BST) Program
Overview

This is a simple Java program that implements a Binary Search Tree (BST). The program allows users to perform various operations on the BST, including insertion, deletion, searching, and different types of traversals (in-order, pre-order, and post-order).
Features

    Insert: Add nodes to the BST.
    Delete: Remove nodes from the BST.
    Search: Find nodes in the BST.
    In-order Traversal: Traverse the BST in in-order manner (left-root-right).
    Pre-order Traversal: Traverse the BST in pre-order manner (root-left-right).
    Post-order Traversal: Traverse the BST in post-order manner (left-right-root).

How to Run

    Clone the Repository

    bash

git clone https://github.com/yourusername/BST-Program.git
cd BST-Program

Compile the Program

bash

javac Main.java

Run the Program

bash

    java Main

    Use the Menu
    Follow the menu options displayed in the console to perform various operations on the BST.

Code Structure
Classes

    BST
        Represents a single node in the BST.
        Contains:
            int a : The key of the node.
            BST L : Reference to the left child.
            BST R : Reference to the right child.

    BinarySearchTree
        Represents the BST and provides methods to manipulate it.
        Methods:
            insert(int a) : Inserts a node with key a into the BST.
            deleteKey(int a) : Deletes a node with key a from the BST.
            search(int a) : Searches for a node with key a in the BST.
            inorder() : Prints the BST in in-order traversal.
            preorder() : Prints the BST in pre-order traversal.
            postorder() : Prints the BST in post-order traversal.

    Main
        Contains the main method and provides a console-based menu for users to interact with the BST.

Example Usage

sql

Welcome to my BST program!!!

Menu:
1. Insert
2. Search
3. In-order Traversal
4. Pre-order Traversal
5. Post-order Traversal
6. Delete
7. Exit
Enter your choice: 1
How many nodes do you want to insert ?: 3
Enter the node which you want to insert: 50
Enter the node which you want to insert: 30
Enter the node which you want to insert: 70

Menu:
1. Insert
2. Search
3. In-order Traversal
4. Pre-order Traversal
5. Post-order Traversal
6. Delete
7. Exit
Enter your choice: 3
In-order traversal: 30 50 70
