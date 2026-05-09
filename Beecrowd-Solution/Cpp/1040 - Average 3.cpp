#include <iostream>
#include <iomanip>
using namespace std;
int main() {
	double N1, N2, N3, N4, MEDIA,NE, MF;
	cin >> N1 >> N2 >> N3 >> N4;
	cin >> NE;
	MEDIA = (2*N1 + 3*N2 + 4*N3 + 1*N4)/10;
	cout<<fixed<<setprecision(1);

	cout << "Media: " << MEDIA << endl;
	if (MEDIA >= 7.0) {
		cout << "Aluno aprovado." << endl;
	}
	if (MEDIA <= 4.9) {
		cout << "Aluno reprovado." << endl;
	}
	if(MEDIA >= 5.0 && MEDIA <= 6.9) {
		cout << "Aluno em exame." << endl;

		MF = (NE + MEDIA)/2;
		cout << "Nota do exame: " <<  NE << endl;
		if ( MF >= 5.0) {
			cout << "Aluno aprovado." << endl;
		}
		if(MF < 5.0) {
			cout << "Aluno reprovado." << endl;
		}
		cout << "Media final: " << MF << endl;

	}

	return 0;
}
