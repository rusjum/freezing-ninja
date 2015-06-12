package algs;

/**
 * Weighted tree version of Union-Find, can be used for real problems
 *
 * Created by rusjum on 6/12/2015.
 */
public class WeightedUnionFind extends QuickUnion {

    private int[] size;
    /**
     * Constructor for WeightedUnionFind, init each element to its own index
     *
     * @param N - number of elements
     */
    public WeightedUnionFind(int N) {
        super(N);
        size = new int[N];
        for (int i = 0; i < N; ++i) {
            size[i] = 1;
        }
    }

    /**
     * Connects two elements depending on a size of the trees, to which elements are belong
     *
     * @param p - index of a first element
     * @param q - index of a second element
     */
    @Override
    public void connect(int p, int q) {
        int rootP = root(p);
        int rootQ = root(q);
        if (size[rootP] < size[rootQ]) {
            storage[rootP] = rootQ;
            size[rootQ] += size[rootP];
        } else {
            storage[rootQ] = rootP;
            size[rootP] += size[rootQ];
        }
    }
}
