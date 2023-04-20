package trees;

import trees.nodes.DictionaryNode;
import trees.nodes.Node;
import trees.nodes.StringNode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * This class contains a group of tree operations.
 *
 * @author Josh Archer
 * @author <your-name>
 * @version 1.0
 */
public class TreeOperations
{
    /**
     * #1 - Inverts the elements in a binary search tree. An inverted
     * tree is tree that contains the same elements as another
     * tree, but the elements are mirrored horizontally. For example:
     *
     * Binary tree:
     *         22
     *       /   \
     *      9    25
     *    /  \     \
     *   2    15   31
     *
     * Inverted tree:
     *         22
     *       /    \
     *      25    9
     *    /     /  \
     *   31    15   2
     *
     * @param root the root of a binary tree
     */
    public void invert(Node root)
    {

    }

    /**
     * #2 - Searches for an element in a binary tree and
     * prints the elements found during the search, from
     * the bottom of the tree back to the root.
     *
     * For example, given the following tree:
     *
     *         22
     *       /   \
     *      9    25
     *    /  \     \
     *   2    15   31
     *
     * Searching for element 15 will print out - 15, 9, 22
     *
     * Hint: A Stack can be used to print the elements in reverse
     * order.
     *
     * @param root the root of a binary search tree
     * @param searchValue the element to search for
     */
    public void bottomUpPath(Node root, int searchValue)
    {

    }

    /**
     * #3 - This method returns the Level-Order (or Breadth-First) search
     * on a tree. This method returns an array list of elements in the
     * tree, level by level through the tree from top to bottom. For
     * example, given the following tree:
     *
     *         22
     *       /   \
     *      9    25
     *    /  \     \
     *   2    15   31
     *
     * would return the list: [22, 9, 25, 2, 15, 31]
     *
     * @param root the root of a binary tree
     * @return a list of elements in the input tree
     */
    public ArrayList<Integer> bfs(Node root)
    {
        return null;
    }

    /**
     * #4 - Identifies the elements in the internal nodes of a binary
     * tree and returns them in a list. For example, given the following
     * tree:
     *
     *         22
     *       /   \
     *      9    25
     *    /  \     \
     *   2    15   31
     *
     *  would return the list: [22, 9, 25] in any order
     *
     * @param root the root of a binary tree
     * @return a list of elements from internal nodes in the tree
     */
    public ArrayList<Integer> getInternalNodes(Node root)
    {
        return null;
    }

    /**
     * Identifies the elements in the leaf nodes of a binary tree
     * and returns them in a list. For example, given the following
     * tree:
     *
     *         22
     *       /   \
     *      9    25
     *    /  \     \
     *   2    15   31
     *
     *  would return the list: [2, 15, 31] in any order
     *
     * @param root the root of a binary tree
     * @return a list of elements from leaf nodes in the tree
     */
    public ArrayList<Integer> getLeafNodes(Node root)
    {
        return null;
    }

    /**
     * #6 - Adds a word/definition pair to a binary tree of DictionaryNode objects
     * that are sorted using the word.
     *
     * @param root the root of a binary search tree
     * @param word a dictionary word
     * @param definition the definition of the word
     */
    public DictionaryNode addWordToTree(DictionaryNode root, String word, String definition)
    {
        return null;
    }

    /**
     * Accepts a dictionary node and searches the tree for the definition
     * matching the word.
     *
     * @param root the root of a binary search tree with word/definition pairs
     * @param word the word to search for
     * @return the definition of the word, stored in the tree, or null if the
     * word is not in the tree
     */
    public String getDefinition(DictionaryNode root, String word)
    {
         return null;
    }

    /**
     * #7 - Returns the smallest element in the tree.
     *
     * @param root the root of the binary search tree
     * @return the minimum element
     */
    public int findMin(Node root)
    {
        return 0;
    }

    /**
     * #7 - Returns the largest element in the tree.
     *
     * @param root the root of the binary search tree
     * @return the maximum element
     */
    public int findMax(Node root)
    {
        return 0;
    }

    /**
     * #8 - Creates a binary search tree of StringNode objects
     * that stores movie titles from an input file. The movie
     * elements are read in sorted order, but then shuffled
     * into random positions before insertion into the tree.
     *
     * @return a root of a random binary search tree of 250
     * movie titles.
     */
    public StringNode createMovieTree()
    {
        return null;
    }

    private static StringNode iterativeAdd(StringNode current, String element)
    {
        return null;
    }

    /**
     * #9 - This method uses loops (rather than recursion) to add
     * the input element to a binary search tree.
     *
     * @param root the root of a binary search tree
     * @param element the element to insert into the tree
     */
    public Node iterativeAdd(Node root, int element)
    {
        return null;
    }

    /**
     * #10 - This method uses loops (rather than recursion) to search
     * for the input element in a binary search tree.
     *
     * @param root the root of a binary search tree
     * @param element the element to insert into the tree
     * @return true if the element is found, or otherwise false
     */
    public boolean iterativeContains(Node root, int element)
    {
        return false;
    }

    /**
     * #11 - Searches for an element in the input tree and returns
     * true if the element is found in an internal node in the tree.
     *
     * @param root the root of a binary search tree
     * @param element the element to search for
     * @return false if the element is not found, or otherwise false
     * @throws NoSuchElementException if the element is not found in the tree
     */
    public boolean isInternal(Node root, int element)
    {
        return false;
    }

    /**
     * #12 - Searches for an element in the input tree and returns
     * true if the element is found in a leaf node in the tree.
     *
     * @param root the root of a binary search tree
     * @param element the element to search for
     * @return false if the element is not found or is not located in
     * a leaf node, or otherwise false
     */
    public boolean isLeaf(Node root, int element)
    {
        return false;
    }

    /**
     * #13 - Finds all elements in the tree within the specified bounds
     * (inclusive) and returns them in a list.
     *
     * @param root the root of a binary search tree
     * @param low the low bound
     * @param high the high bound
     * @return a list of elements in the range [low, high]
     */
    public ArrayList<Integer> inRange(Node root, int low, int high)
    {
        return null;
    }

    /**
     * #14 - Finds the largest element that is smaller than the root element. If no elements
     * are smaller than the root, then the root is returned instead.
     *
     * @param root the root of a binary search tree
     * @return the largest element in the tree that is also smaller than the root, or the
     * root if there are no elements smaller than the root
     */
    public int largestBeforeRoot(Node root)
    {
        return 0;
    }

    /**
     * #15 - Finds the smallest element that is larger than the root element. If no elements
     * are larger than the root, then the root is returned instead.
     *
     * @param root the root of a binary search tree
     * @return the smallest element in the tree that also is larger than the root, or the
     * root if there are no elements larger than the root
     */
    public int smallestAfterRoot(Node root)
    {
        return 0;
    }
}
