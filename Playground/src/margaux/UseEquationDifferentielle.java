
package margaux;




public class UseEquationDifferentielle
	{

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public static void main(String[] args)
		{
		main();
		}

	public static void main()
		{
			EquationDifferentielle equadiff = new EquationDifferentielle(50, 25, 4, 2, 2);
//			double y = equadiff.quantiteTempsT(25);
			double y = equadiff.tempsQuantiteQ(135.62);
//			equadiff.getEquation();

			System.out.println(y);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	}
