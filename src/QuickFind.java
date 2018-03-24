/**
 * Created by parker on 3/24/18.
 */
public class QuickFind implements UnionFindInterface {

    private int[] id;

    public QuickFind(int p)
    {
        this.id = new int[p];

        for (int i = 0; i < p; i++)
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
