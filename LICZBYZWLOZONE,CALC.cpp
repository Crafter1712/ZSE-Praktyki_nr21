#include <iostream>
#include <math.h>

using namespace std;

struct zespolona
{

float rzeczywista;
float urojona;

};
int main() 
{
	zespolona z1, z2, zw;
	int liczba;
	
	cout <<"1.DODAWANIE"<<endl;
	cout <<"2.ODEJMOWANIE"<<endl;
	cout <<"3.MNOZENIE"<<endl;
	cout <<"4.DZIELENIE"<<endl;
	cin >>liczba;
	
	switch (liczba)
	{
		case 1:
			cin>> z1.rzeczywista;
			cin>> z1.urojona;
			cin>>z2.rzeczywista;
			cin>>z2.urojona;
			zw.rzeczywista =z1.rzeczywista +z2.rzeczywista;
			zw.urojona =z1.urojona +z2.urojona;
			cout <<zw.rzeczywista<< " + "<< zw.urojona<< "i" <<endl;
			break;
		case 2:
			cin>> z1.rzeczywista;
			cin>> z1.urojona;
			cin>> z2.rzeczywista;
			cin>> z2.urojona;
			zw.rzeczywista =z1.rzeczywista - z2.rzeczywista;
			zw.urojona =z1.urojona - z2.urojona;
			cout <<zw.rzeczywista<< " + "<<zw.urojona<< "i" <<endl;
			break;
		case 3:
			cin>> z1.rzeczywista;
			cin>> z1.urojona;
			cin>> z2.rzeczywista;
			cin>> z2.urojona;
			zw.urojona =(z2.urojona*z1.rzeczywista)+(z2.rzeczywista*z1.urojona);
			zw.rzeczywista =(z1.rzeczywista*z2.rzeczywista)-(z1.urojona*z2.urojona);
			
			cout <<zw.rzeczywista<< " + "<< zw.urojona << "i" <<endl;
			break;
		case 4:
			cin>> z1.rzeczywista;
			cin>> z1.urojona;
			cin>> z2.rzeczywista;
			cin>> z2.urojona;
			zw.rzeczywista =((z1.rzeczywista*z2.rzeczywista)+(z1.urojona*z2.urojona)/(z2.rzeczywista*z2.rzeczywista+z2.urojona*z2.urojona));
			zw.urojona =(z1.urojona*z2.rzeczywista-z2.urojona*z1.rzeczywista)/(z2.rzeczywista*z2.rzeczywista+z2.urojona*z2.urojona);
			cout <<zw.rzeczywista<< " + "<< zw.urojona<<"i" <<endl;
			break;
	default:
		break;
		
	}
	
	
	
	return 0;
}
