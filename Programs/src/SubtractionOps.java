public class SubtractionOps
{
    private static int variableX;
    private static int variableY;

    public SubtractionOps(int x, int y)
    {
        variableX = x;
        variableY = y;
    }

    public static int getVariableX()
    {
        return variableX;
    }

    public static int getVariableY()
    {
        return variableY;
    }

    public static int getProduct()
    {
        int product = getVariableX() - getVariableY();
        return product;
    }

}
