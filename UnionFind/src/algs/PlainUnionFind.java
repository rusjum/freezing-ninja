package algs;

/**
 * Simple implementation of Union find with array.
 * For demo of small datasets only.
 * 'Find' operation complexity is O(1) (constant, while access to array element by index is constant)
 * 'Union' operation complexity is O(n), where n is number of elements
 *
 * Created by rusjum on 6/11/2015.
 */

public class PlainUnionFind extends UnionFind {

    /**
     * Constructor for UnionFind, init each element to its own index
     *
     * @param N - number of elements
     */
    public PlainUnionFind(int N) {
        super(N);
    }

    /**
     * iSConnected checks whenever two elements are connected by comparison of elements' indexes
     *
     * @param p - index of a first element
     * @param q - index of a second element
     * @return true if elements are connected, false otherwise
     */
    @Override
    public boolean isConnected(int p, int q) {
        return storage[p] == storage[q];
    }

    /**
     * Connect connects two elements by changing index of elements,
     * connected to second element on index of first element
     *
     * @param p - index of a first element
     * @param q - index of a second element
     */
    @Override
    public void connect(int p, int q) {
        if (!isConnected(p, q)) {
            int curIdx = storage[q];
            for (int i = 0; i < storage.length; ++i) {
                if (storage[i] == curIdx)
                    storage[i] = storage[p];
            }
        }
    }
}
