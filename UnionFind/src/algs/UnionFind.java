package algs;

/**
 * Abstract class for UnionFind problem
 *
 * Created by rusjum on 6/11/2015.
 */
public abstract class UnionFind  {

    protected int[] storage;

    /**
     * Constructor for UnionFind, init each element to its own index
     *
     * @param N - number of elements
     */
    public UnionFind(int N) {
        storage = new int[N];
        for (int i = 0; i < N; ++i)
            storage[i] = i;
    }

    /**
     * iSConnected checks whenever two elements are connected
     *
     * @param p - index of a first element
     * @param q - index of a second element
     * @return true if elements are connected, false otherwise
     */
    public abstract boolean isConnected(int p, int q);

    /**
     * Connect connects two elements by changing index of elements,
     * connected to second element on index of first element
     *
     * @param p - index of a first element
     * @param q - index of a second element
     */
    public abstract void connect(int p, int q);
}
