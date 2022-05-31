//https://app.patika.dev/gazellhatice

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int mouth,day;
        boolean isErro =false;
        String burc="";
        Scanner imput=new Scanner(System.in);
        System.out.print("Doğduğunuz Ay :");
        mouth=imput.nextInt();
        System.out.print("Doğduğunuz Gün :");
        day= imput.nextInt();

        if(mouth==1) {
            if (day >= 1 && day <= 31) {
                if (day > 21) {
                    burc = "Kova";
                } else {
                    burc = "Oğlak";
                }
            } else {
                isErro = true;
            }
        }
        else if (mouth==2) {
            if (day >= 1 && day <= 28) {
                if (day > 19) {
                    burc = "Balık";
                } else {
                    burc = "Kova";
                }
            } else {
                isErro = true;
            }
        } else if (mouth==3) {
            if (day >= 1 && day <= 31) {
                if (day > 20) {
                    burc = "Koç";
                } else {
                    burc = "Balık";
                }
            } else {
                isErro = true;

            }
        } else if (mouth==4) {
            if (day >= 1 && day <= 31) {
                if (day > 20) {
                    burc = "Boğa";
                } else {
                    burc = "Koç";
                }
            } else {
                isErro = true;
            }
        } else if (mouth==5) {
            if (day >= 1 && day <= 31) {
                if (day > 21) {
                    burc = "İkizler";
                } else {
                    burc = "Boğa";
                }
            } else {
                isErro = true;
            }
        } else if (mouth==6) {
            if (day >= 1 && day <= 30) {
                if (day > 22) {
                    burc = "Yengeç";
                } else {
                    burc = "İkizler";
                }
            } else {
                isErro = true;
            }
        } else if (mouth==7) {
            if (day >= 1 && day <= 30) {
                if (day > 22) {
                    burc = "Aslan";
                }
                burc = "Yengeç";
            } else {
                isErro = true;
            }
        } else if (mouth==8) {
            if (day >= 1 && day <= 31) {
                if (day > 22) {
                    burc = "Başak";
                } else {
                    burc = "Aslan";
                }
            } else {
                isErro = true;
            }
        } else if (mouth==9) {
            if (day >= 1 && day <= 30) {
                if (day > 22) {
                    burc = "Terazi";
                } else {
                    burc = "Başak";
                }
            } else {
                isErro = true;
            }
        } else if (mouth==10) {
            if (day >= 1 && day <= 31) {
                if (day > 22) {
                    burc = "Akrep";
                } else {
                    burc = "Terazi";
                }
            } else {
                isErro = true;
            }
        } else if (mouth==11) {
            if (day >= 1 && day <= 30) {
                if (day > 21) {
                    burc = "Yay";
                } else {
                    burc = "Akrep";
                }
            } else {
                isErro = true;
            }
        } else if (mouth==12) {
            if (day >= 1 && day <= 31) {
                if (day > 21) {
                    burc = "Oğlak";
                } else {
                    burc = "Yay";
                }
            } else {
                isErro = true;
            }
        } else if (mouth>12) {
            isErro = true;
        }

        if(isErro) {
            System.out.println("Hatalı Giriş Yaptınız , Lütfen Tekrar Deniyiniz ! ");
        }else {
            System.out.println("Burcunuz : "+burc);

        }

    }

}