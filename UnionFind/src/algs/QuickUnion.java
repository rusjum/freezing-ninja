package algs;

/**
 * Lazy implementation of QuickUnion by a tree
 *
 * Created by rusjum on 6/11/2015.
 */
public class QuickUnion extends UnionFind {

    /**
     * Constructor for UnionFind, init each element to its own index
     *
     * @param N - number of elements
     */
    public QuickUnion(int N) {
        super(N);
    }

    /**
     * Finds root of the element
     *
     * @param el - id of the element root of which is required
     * @return id of the root of the element
     */
    protected int root(int el) {
        while (el != storage[el]) {
            storage[el] = storage[storage[el]];
            el = storage[el];
        }
        return el;
    }
    /**
     * iSConnected checks whenever two elements are connected by comparison of elements' root indexes
     *
     * @param p - index of a first element
     * @param q - index of a second element
     * @return true if elements are connected, false otherwise
     */
    @Override
    public boolean isConnected(int p, int q) {
        return root(p) == root(q);
    }

    /**
     * Connects two elements
     *
     * @param p - index of a first element
     * @param q - index of a second element
     */
    @Override
    public void connect(int p, int q) {
        int rootP = root(p);
        int rootQ = root(q);
        storage[rootQ] = rootP;

    }
}
