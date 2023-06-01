#include<bits/stdc++.h>
using namespace std ;
int khoa[2][2],khoa1[2][2];
void initkhoa()
{
 int i,j,tg,d;
 do
 {
 for(i=0;i<2;i++)
 for(j=0;j<2;j++)
{
 cout<<"nhap khoa["<<i<<"]["<<j<<"]=";cin>>tg;khoa[i][j]=tg%26;
}
 d=khoa[0][0]*khoa[1][1]-khoa[0][1]*khoa[1][0];
 if((d%26)!=1)
 cout<<"\n khoa khong thoa man";
 }
 while((d%26)!=1);
 khoa1[0][0]=khoa[1][1];
 khoa1[1][1]=khoa[0][0];
 khoa1[0][1]=(26-khoa[0][1])%26;
 khoa1[1][0]=(26-khoa[1][0])%26;
}
/**************************************************/
void nhanmatran(int a[2],int b[2][2],int c[2])
{
c[0]=(a[0]*b[0][0]+a[1]*b[1][0])%26;
c[1]=(a[0]*b[0][1]+a[1]*b[1][1])%26;
}
char *lapma(char *banro)
{
 char *tmp;/*=new char[10];*/
 int i,l;
 int a[2],b[2];
 l=strlen(banro);
 for(i=0;i<l;i++)
 banro[i]=toupper(banro[i]);
 for(i=0;i<l;i++)
 {
a[0]=(banro[i]-65)%26;a[1]=(banro[i+1]-65)%26;
nhanmatran(a,khoa,b);
tmp[i]=(b[0]%26)+65;tmp[i+1]=(b[1]%26)+65;i++;
 }
 tmp[l]='\0';
 return tmp;
}
char *giaima(char *banma)
{
 char *tmp;/*=new char[10];*/
 int i,l;
 int a[2],b[2];
 l=strlen(banma);
 for(i=0;i<l;i++)
 banma[i]=toupper(banma[i]);
 for(i=0;i<l;i++)
 {
a[0]=(banma[i]-65)%26;a[1]=(banma[i+1]-65)%26;
nhanmatran(a,khoa1,b);
tmp[i]=(b[0]%26)+65;tmp[i+1]=(b[1]%26)+65;i++;
 }
 tmp[l]='\0';
 return tmp;
}
int main()
{
 int i,j,a[2],b[2];;
// clrscr();
char *chuoi=new char [100],*chuoi1=new char [100],*chuoi2=new char [100];
 cout<<"nhap chuoi can ma hoa: ";gets(chuoi);
 initkhoa();
 chuoi1=lapma(chuoi);
 chuoi2=giaima(chuoi1);
 cout<<chuoi1;
 cout<<"\n";
 cout<<chuoi2;
 /*cout<<"ban ma sau khi ma hoa la:"<<lapma(banro);
cout<<"\nban ro sau khi giai ma la:"<<giaima(banma);*/
 //getch();
}
