/**
 * Created by parker on 3/24/18.
 */
public class QuickUnion implements UnionFindInterface {

    private int[] id;

    public QuickUnion(int N)
    {
        this.id = new int[N];

        for (int i = 0; i < N; i++)
        {
            this.id[i] = i;
        }
    }

    public void union(int p, int q)
    {

    }

    public boolean connected(int p, int q)
    {
        return false;
    }

    public int find(int p)
    {
        return 0;
    }

    public int count()
    {
        return this.id.length;
    }
}
