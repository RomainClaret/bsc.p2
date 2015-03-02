
package margaux;



public class EquationDifferentielle
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public EquationDifferentielle(double content, double content_val, double in_val, double in_debit, double out_debit)
		{
		this.content = content;
		this.content_val = content_val;
		this.in_val = in_val;
		this.in_debit = in_debit;
		this.out_debit = out_debit;

		init();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public double quantiteTempsT(double t)
		{
			y = Math.pow(out, -1) * in + C * Math.exp(-t*out);
			return y;
		}

	public double tempsQuantiteQ(double q)
		{
			return Math.log((q - Math.pow(out,-1)*in ) / C) / (-out);
		}

	private void init()
		{
			in = in_val * in_debit;
			out = out_debit / content;
			C = content_val - Math.pow(out, -1) * in;
		}

	public void getEquation()
		{
			System.out.println(Math.pow(out, -1) * in +"+"+ C +"* e^-t*"+out);
		}


	/*------------------------------*\
	|*				Set				*|
	\*------------------------------*/

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Input
	private double content;
	private double content_val;
	private double in_val;
	private double in_debit;
	private double out_debit;

	//Tools
	private double in;
	private double out;
	private double C;

	//Output
	private double y;
	}
