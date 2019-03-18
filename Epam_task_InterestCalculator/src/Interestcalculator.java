import java.lang.Math;
public class Interestcalculator {
	double simple(double p,double r,int t)
    {
		return (double)(p*r*t);
    }
    double compound(double p,double r,int t,int n)
    {
		return (double)(p*Math.pow((1+(r/n)),n*t));
    }
}
