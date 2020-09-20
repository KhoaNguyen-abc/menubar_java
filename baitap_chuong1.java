//package menubar_pack;
import java.util.Scanner;
import java.util.Random;

public class baitap_chuong1{
	
	static final double PI = 3.14;
	
	public static boolean isNumber(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				return true;
			}
		}
		return false;
	}
	
	public static int isTrue(String s) {
		Scanner input = new Scanner(System.in);
		int n = 0;
		while(!isNumber(s)) {
			System.out.print("\n");
			System.out.println("INPUT DANG CHU, NHAP LAI ");
			s = input.nextLine();
		}
		if(isNumber(s)) {
			n = Integer.parseInt(s);
		}
		return n;
	}

	public static int tong(int a, int b) {
		return a + b;
	}

	public static int hieu(int a, int b) {
		return a - b;
	}

	public static int tich(int a, int b) {
		return a * b;
	}

	public static float thuong(float a, float b) {
		return a / b;
	}
	
	public static int chuvi_hcn(int a,int b) {
		return (a+b)*2;
	}
	
	public static int dientich_hcn(int a,int b) {
		return a*b;
	}
	
	public static double chuvi_ht(float r) {
		return r*2*PI;
	}
	
	public static double dientich_ht(float r) {
		return PI*r*r;
	}
	
	public static boolean so_chan(int n) {
		if(n%2 == 0) {
			return true;
		}
		return false;
	}
	
	public static boolean so_le(int n) {
		if(n%2 == 0) {
			return false;
		}
		return true;
	}
	
	
	public static boolean isPrime(int n) {
		int dem = 0;
		for(int i=1; i <= n; i++) {
			if(n%i == 0) dem++;
		}
		
		if(dem == 2) return true;
		return false;
	}

	public static void del_space(String s) {
		char[] c = s.toCharArray();
		String s1 ="";
		for(int i=0; i< c.length; i++){
			if(c[i]!=' ') {
				s1 = s1 + c[i];
			}
		}
		System.out.print("CHUOI SAU KHI XOA KHOANG TRANG THUA: "+ s1);
	}
	
	public static void count_word(String s) {
		int count = 0;
		String[] str = s.split(" ");
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
			count++;
		}
		System.out.print("Dem tu: "+count);
		System.out.print("\n");
	}
	
	public static void left_right_char(String s, int k) {
		char[] c = s.toCharArray();
		
		for(int i=0; i<k; i++) {
			System.out.print(c[i]);
		}
		
		System.out.print(" ");
		
		String s1 = "";
		for(int i=s.length()-1; i>=0; i--) {
			s1 = s1 + s.charAt(i);
		}
		
		char[] c1 = s1.toCharArray();
		for(int i=0; i<k; i++) {
			System.out.print(c1[i]);
		}
		
	}
	public static void input_array(int[] a, int n) {
		Random input = new Random();
		
		for(int i=0; i < n; i++) {
			System.out.print("a["+i+"]=");
			a[i] = input.nextInt(100);
		}
		System.out.print("\n");
	}
	
	public static void insert_array(int[] a, int n, int k, int x) {
		for(int i=n; i > k; i--) {
			a[i] = a[i-1];
		}
		a[k] = x;
		n++;
		for(int i=0; i<n; i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	public static void delete_array(int[] a, int n, int k) {
		for(int i=k; i<n-1; i++) {
			a[i] = a[i+1];
		}
		n--;
		for(int i=0; i<n; i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	public static int pos_array(int[] a, int n, int x) {
		int i = 0;
		while(i < n && a[i]!=x) {
			 i++;
		}
		if(i == n) return -1;
		return i;
	}
	
	public static void output_array(int[] a, int n) {
		for(int i=0; i<n; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("\n");
	}
	
	public static void menu1(int key, boolean cont_con) {
		Scanner input = new Scanner(System.in);
		int n = 0, m = 0;
		float h = 0, k = 0;
		char t = 0;
		cont_con = false;
		
		do {
			System.out.print("NHAP SO NGUYEN THU 1: ");
			String a = input.nextLine();
			n = isTrue(a);
			h = (float) n;
			System.out.print("NHAP SO NGUYEN THU 2: ");
			String b = input.nextLine();
			m = isTrue(b);
			k = (float) m;
			System.out.println("Tong= " + tong(n,m));
			System.out.println("Hieu= " + hieu(n,m));
			System.out.println("Tich= " + tich(n,m));
			System.out.printf("Thuong= %.2f\n", thuong(h,k));
			System.out.print("NHAN t/T DE TIEP TUC HOAC PHIM BAT KY DE THOAT RA MENU CHINH: ");
			t = input.next().charAt(0);
			if(t == 't' || t == 'T') cont_con = true;
			else cont_con = false;
		}while(cont_con == true);
	}
	
	public static void menu2(int key, boolean cont_con) {
		Scanner input = new Scanner(System.in);
		int n = 0, m = 0;
		char t = 0;
		cont_con = false;
		do {
			System.out.print("NHAP CHIEU DAI: ");
			String a = input.nextLine();
			n = isTrue(a);
			System.out.print("NHAP CHIEU RONG: ");
			String b = input.nextLine();
			m = isTrue(b);
			System.out.println("Chu vi hinh chu nhat= " + chuvi_hcn(n,m));
			System.out.println("Dien tich hinh chu nhat= " + dientich_hcn(n,m));
			System.out.print("NHAN t/T DE TIEP TUC HOAC PHIM BAT KY DE THOAT RA MENU CHINH: ");
			t = input.next().charAt(0);
			if(t == 't' || t == 'T') cont_con = true;
			else cont_con = false;
		}while(cont_con == true);
	}
	
	public static void menu3(int key, boolean cont_con) {
		Scanner input = new Scanner(System.in);
		float r = 0;
		char t = 0;
		cont_con = false;
		
		do {
			System.out.print("NHAP BAN KINH: ");
			String a = input.nextLine();
			r = isTrue(a);
			System.out.println("Chu vi hinh tron= " + chuvi_ht(r));
			System.out.println("Dien tich hinh tron= " + dientich_ht(r));
			System.out.print("NHAN t/T DE TIEP TUC HOAC PHIM BAT KY DE THOAT RA MENU CHINH: ");
			t = input.next().charAt(0);
			if(t == 't' || t == 'T') cont_con = true;
			else cont_con = false;
		}while(cont_con == true);
	}
	
	public static void menu4(int key, boolean cont_con) {
		Scanner input = new Scanner(System.in);
		int n = 0;
		char t = 0;
		cont_con = false;
		
		do {
			System.out.print("NHAP SO NGUYEN N DE KIEM TRA: ");
			String a = input.nextLine();
			n = isTrue(a);
			
			if(so_chan(n)) {
				System.out.println(n+ " la so chan");
			}else {
				System.out.println(n+ " la so le");
			}
			System.out.print("NHAN t/T DE TIEP TUC HOAC PHIM BAT KY DE THOAT RA MENU CHINH: ");
			t = input.next().charAt(0);
			if(t == 't' || t =='T') cont_con = true;
			else cont_con = false;
		}while(cont_con == true);
	}
	
	public static void menu5(int key, boolean cont_con) {
		Scanner input = new Scanner(System.in);
		int n = 0;
		char t = 0;
		cont_con = false;
		
		do {
			System.out.print("NHAP SO NGUYEN N DE KIEM TRA: ");
			String a = input.nextLine();
			n = isTrue(a);
			
			if(n == 0) System.out.println(n +"la zero");
			else if(n > 0) {
				System.out.println(n +" la so duong");
			}else {
				System.out.println(n +" la so am");
			}
			System.out.print("NHAT t/T DE TIEP TUC HOAC PHIM BAT KY DE THOAT RA MENU CHINH: ");
			t = input.next().charAt(0);
			if(t == 't' || t == 'T') cont_con = true;
			else cont_con = false;
		}while(cont_con == true);
	}
	
	public static void menu6(int key, boolean cont_con) {
		Scanner input = new Scanner(System.in);
		int n = 0;
		char t = 0;
		cont_con = false;
		
		do {
			System.out.print("NHAP SO NGUYEN N DE KIEM TRA: ");
			String a = input.nextLine();
			n = isTrue(a);
			if(!isPrime(n)) {
				System.out.println(n+ " khong phai la so nguyen to");
			}else {
				System.out.println(n+ " la so nguyen to");
			}
			System.out.print("NHAN t/T DE TIEP TUC HOAC PHIM BAY KY DE THOAT RA MENU CHINH: ");
			t = input.next().charAt(0);
			if(t == 't' || t == 'T') cont_con = true;
			else cont_con = false;
		}while(cont_con == true);
	}
	
	public static void menu7_a(char key, boolean cont_con1) {
		Scanner input = new Scanner(System.in);
		int tong = 0, n = 0;
		char t = 0;
		cont_con1 = false;
		
		do {
			tong = 0;
			System.out.print("NHAP SO NGUYEN N: ");
			String b = input.nextLine();
			n = isTrue(b);
			System.out.println("CAC SO TU NHIEN <=N");
			for(int i=1; i <=n; i++) {
				System.out.print(i+ " ");
				tong +=i;
			}
			System.out.print("\n");
			System.out.println("TONG CAC SO TU NHIEN <=N: " + tong);
			System.out.print("\n");
			System.out.print("NHAN t/T DE TIEP TUC HOAC PHIM BAT KY DE THOAT RA MENU: ");
			t = input.next().charAt(0);
			if(t == 't' || t == 'T') cont_con1 = true;
			else cont_con1 = false;
		} while(cont_con1 == true);
	}
	
	public static void menu7_b(int key, boolean cont_con1) {
		Scanner input = new Scanner(System.in);
		int tong = 0, n = 0;
		char t = 0;
		cont_con1 = false;
		
		do {
			tong = 0;
			System.out.print("NHAP SO NGUYEN N: ");
			String b = input.nextLine();
			n = isTrue(b);
			System.out.println("CAC SO TU NHIEN CHAN <=N");
			for(int i=1; i<=n; i++) {
				if(so_chan(i)) {
				System.out.print(i+" ");
				tong +=i;
				}
			}
			System.out.print("\n");
			System.out.print("TONG CAC SO TU NHIEN CHAN <=N: " + tong);
			System.out.print("\n");
			System.out.print("NHAN t/T DE TIEP TUC HOAC PHIM BAT KY DE THOAT RA MENU: ");
			t = input.next().charAt(0);
			if(t == 't' || t == 'T') cont_con1 = true;
			else cont_con1 = false;
		} while(cont_con1 == true);
	}
	
	public static void menu7_c(int key, boolean cont_con1) {
		Scanner input = new Scanner(System.in);
		int tong = 0, n = 0;
		char t = 0;
		cont_con1 = false;
		
		do {
			tong = 0;
			System.out.print("NHAP SO NGUYEN N: ");
			String b = input.nextLine();
			n = isTrue(b);
			System.out.println("CAC SO TU NHIEN LE <=N");
			for(int i=1; i<=n; i++) {
				if(so_le(i)) {
				System.out.print(i+" ");
				tong +=i;
				}
			}
			System.out.print("\n");
			System.out.print("TONG CAC SO TU NHIEN LE <=N: " + tong);
			System.out.print("\n");
			System.out.print("NHAN t/T DE TIEP TUC HOAC PHIM BAT KY DE THOAT RA MENU: ");
			t = input.next().charAt(0);
			if(t == 't' || t == 'T') cont_con1 = true;
			else cont_con1 = false;
		} while(cont_con1 == true);
	}
		
		public static void menu7_d(int key, boolean cont_con1) {
			Scanner input = new Scanner(System.in);
			int tong = 0, n = 0;
			char t = 0;
			cont_con1 = false;
			
			do {
				tong = 0;
				System.out.print("NHAP SO NGUYEN N: ");
				String b = input.nextLine();
				n = isTrue(b);
				System.out.println("CAC SO TU NHIEN LA SO NGUYEN TO <=N");
				for(int i=1; i<=n; i++) {
					if(isPrime(i)) {
					System.out.print(i+" ");
					tong +=i;
					}
				}
				System.out.print("\n");
				System.out.print("TONG CAC SO TU NHIEN LE <=N: " + tong);
				System.out.print("\n");
				System.out.print("NHAN t/T DE TIEP TUC HOAC PHIM BAT KY DE THOAT RA MENU: ");
				t = input.next().charAt(0);
				if(t == 't' || t == 'T') cont_con1 = true;
				else cont_con1 = false;
			} while(cont_con1 == true);
		}
			
			public static void menu7_e(int key, boolean cont_con1) {
				Scanner input = new Scanner(System.in);
				int tong = 0, n = 0;
				int i = 1, dem = 0;
				char t = 0;
				cont_con1 = false;
				
				do {
					dem = 0; i = 1;
					System.out.print("NHAP SO NGUYEN N: ");
					String b = input.nextLine();
					n = isTrue(b);
					while(dem < n) {
						if(isPrime(i)) {
							System.out.print(i+" ");
							dem++;
						}
						i++;
					}
					System.out.print("\n");
					System.out.print("NHAN t/T DE TIEP TUC HOAC PHIM BAT KY DE THOAT RA MENU: ");
					t = input.next().charAt(0);
					if(t == 't' || t == 'T') cont_con1 = true;
					else cont_con1 = false;
				} while(cont_con1 == true);
			}
			
			public static void menu8_a(int key, int[] a, boolean cont_con1) {
				Scanner input = new Scanner(System.in);
				int tong = 0, n = 0;
				char t = 0;
				cont_con1 = false;
				
				do {
					tong = 0;
					System.out.print("NHAP SO NGUYEN N: ");
					String b = input.nextLine();
					n = isTrue(b);
					input_array(a, n);
					output_array(a, n);
					System.out.println("CAC PHAN TU CUA MANG A");
					for(int i=0; i<n; i++) {
						System.out.print(a[i]+" ");
						tong +=a[i];
					}
					System.out.print("\n");
					System.out.print("TONG CUA CAC PHAN TU CUA MANG A: " + tong);
					System.out.print("\n");
					System.out.print("NHAN t/T DE TIEP TUC HOAC PHIM BAT KY DE THOAT RA MENU: ");
					t = input.next().charAt(0);
					if(t == 't' || t == 'T') cont_con1 = true;
					else cont_con1 = false;
				} while(cont_con1 == true);
			}
			
			public static void menu8_b(int key, int[] a, boolean cont_con1) {
				Scanner input = new Scanner(System.in);
				int tong = 0, n = 0;
				char t = 0;
				cont_con1 = false;
				
				do {
					tong = 0;
					System.out.print("NHAP SO NGUYEN N: ");
					String b = input.nextLine();
					n = isTrue(b);
					input_array(a, n);
					output_array(a, n);
					System.out.println("CAC PHAN TU CHAN CUA MANG A");
					for(int i=0; i<n; i++) {
						if(so_chan(a[i])) {
							System.out.print(a[i]+ " ");
							tong +=a[i];
						}
					}
					System.out.print("\n");
					System.out.print("TONG CUA CAC PHAN TU CHAN CUA MANG A: " + tong);
					System.out.print("\n");
					System.out.print("NHAN t/T DE TIEP TUC HOAC PHIM BAT KY DE THOAT RA MENU: ");
					t = input.next().charAt(0);
					if(t == 't' || t == 'T') cont_con1 = true;
					else cont_con1 = false;
				} while(cont_con1 == true);
			}
			
			public static void menu8_c(int key, int[] a, boolean cont_con1) {
				Scanner input = new Scanner(System.in);
				int tong = 0, n = 0;
				char t = 0;
				cont_con1 = false;
				
				do {
					tong = 0;
					System.out.print("NHAP SO NGUYEN N: ");
					String b = input.nextLine();
					n = isTrue(b);
					input_array(a, n);
					output_array(a, n);
					System.out.println("CAC PHAN TU LE CUA MANG A");
					for(int i=0; i<n; i++) {
						if(so_le(a[i])) {
							System.out.print(a[i]+" ");
							tong += a[i];
						}
					}
					System.out.print("\n");
					System.out.print("TONG CUA CAC PHAN TU LE CUA MANG A: " + tong);
					System.out.print("\n");
					System.out.print("NHAN t/T DE TIEP TUC HOAC PHIM BAT KY DE THOAT RA MENU: ");
					t = input.next().charAt(0);
					if(t == 't' || t == 'T') cont_con1 = true;
					else cont_con1 = false;
				} while(cont_con1 == true);
			}
			
			public static void menu8_d(int key, int[] a, boolean cont_con1) {
				Scanner input = new Scanner(System.in);
				int tong = 0, n = 0;
				char t = 0;
				cont_con1 = false;
				
				do {
					tong = 0;
					System.out.print("NHAP SO NGUYEN N: ");
					String b = input.nextLine();
					n = isTrue(b);
					input_array(a, n);
					output_array(a, n);
					System.out.println("CAC PHAN TU LA SO NGUYEN TO CUA MANG A");
					for(int i=0; i<n; i++) {
						if(isPrime(a[i])) {
							System.out.print(a[i]+ " ");
							tong += a[i];
						}
					}
					System.out.print("\n");
					System.out.print("TONG CUA CAC PHAN TU LA SO NGUYEN TO CUA MANG A: " + tong);
					System.out.print("\n");
					System.out.print("NHAN t/T DE TIEP TUC HOAC PHIM BAT KY DE THOAT RA MENU: ");
					t = input.next().charAt(0);
					if(t == 't' || t == 'T') cont_con1 = true;
					else cont_con1 = false;
				} while(cont_con1 == true);
			}
			
			public static void menu8_e(int key, int[] a, boolean cont_con1) {
				Scanner input = new Scanner(System.in);
				int tong = 0, n = 0, m = 0, p = 0;
				char t = 0;
				cont_con1 = false;
				
				do {
					tong = 0;
					System.out.print("NHAP SO NGUYEN N: ");
					String b = input.nextLine();
					n = isTrue(b);
					input_array(a, n);
					output_array(a, n);
					System.out.print("NHAP VI TRI CAN CHEN VAO MANG A: ");
					String c = input.nextLine();
					m = isTrue(c);
					System.out.print("NHAP GIA TRI CAN CHEN VAO MANG A: ");
					String d = input.nextLine();
					p = isTrue(d);
					for(int i=n; i>m; i--) {
						a[i] = a[i-1];
					}
					a[m] = p;
					n++;
					System.out.println("SAU KHI CHEN VAO MANG A");
					output_array(a, n);
					System.out.print("\n");
					System.out.print("NHAN t/T DE TIEP TUC HOAC PHIM BAT KY DE THOAT RA MENU: ");
					t = input.next().charAt(0);
					if(t == 't' || t == 'T') cont_con1 = true;
					else cont_con1 = false;
				} while(cont_con1 == true);
			}
			
			public static void menu8_f(int key, int[] a, boolean cont_con1) {
				Scanner input = new Scanner(System.in);
				int tong = 0, n = 0, m = 0;
				char t = 0;
				cont_con1 = false;
				
				do {
					tong = 0;
					System.out.print("NHAP SO NGUYEN N: ");
					String b = input.nextLine();
					n = isTrue(b);
					input_array(a, n);
					output_array(a, n);
					System.out.println("NHAP VI TRI CAN XOA CUA MANG A");
					String c = input.nextLine();
					m = isTrue(c);
					for(int i=m; i<n-1; i++) {
						a[i] = a[i+1];
					}
					n--;
					System.out.println("SAU KHI XOA VI TRI PHAN TU CUA MANG A");
					output_array(a, n);
					System.out.print("\n");
					System.out.print("NHAN t/T DE TIEP TUC HOAC PHIM BAT KY DE THOAT RA MENU: ");
					t = input.next().charAt(0);
					if(t == 't' || t == 'T') cont_con1 = true;
					else cont_con1 = false;
				} while(cont_con1 == true);
			}
			
			public static void menu9_a(int key, String s, boolean cont_con1) {
				Scanner input = new Scanner(System.in);
				
				System.out.print("NHAP CHUOI S: ");
				s = input.nextLine();
				
				System.out.print("DO DAI CUA CHUOI: " + s.length());
				System.out.print("\n");
			}
			
			public static void menu9_b(int key, String s, boolean cont_con1) {
				Scanner input = new Scanner(System.in);
				
				System.out.print("NHAP CHUOI S: ");
				s = input.nextLine();
				
				del_space(s);
			}
			
			public static void menu9_c(int key, String s, boolean cont_con1) {
				Scanner input = new Scanner(System.in);
				
				System.out.print("NHAP CHUOI S: ");
				s = input.nextLine();
				
				count_word(s);
				
			}
			
			public static void menu9_d(int key, String s, boolean cont_con1) {
				Scanner input = new Scanner(System.in);
				int k = 0;
				System.out.print("NHAP CHUOI S: ");
				s = input.nextLine();
				System.out.print("NHAP K:");
				String a = input.nextLine();
				k = isTrue(a);
				
				left_right_char(s, k);
			}
			
			public static void menu9_e(int key, String s, boolean cont_con1) {
				Scanner input = new Scanner(System.in);
				int k = 0, n = 0;
				System.out.print("NHAP CHUOI S: ");
				s = input.nextLine();
				System.out.print("NHAP VI TRI K CAN BAT DAU: ");
				String a = input.nextLine();
				k = isTrue(a);
				System.out.print("NHAP N KI TU CAN XUAT: ");
				String b = input.nextLine();
				n = isTrue(b);
				System.out.print("CHUOI CAN XUAT RA KET QUA: ");
				char[] c = s.toCharArray();
				for(int i=k; i<=n; i++) {
					System.out.print(c[i]);
				}				
				System.out.print("\n");
			}

			public static void menu8_g(int key, int[] a, boolean cont_con1) {
				Scanner input = new Scanner(System.in);
				int tong = 0, n = 0, m = 0;
				char t = 0;
				cont_con1 = false;
				
				do {
					tong = 0;
					System.out.print("NHAP SO NGUYEN N: ");
					String b = input.nextLine();
					n = isTrue(b);
					input_array(a, n);
					output_array(a, n);
					System.out.print("NHAP X KIEM TRA CO TRONG MANG A HAY KHONG");
					String c = input.nextLine();
					m = isTrue(c);
					pos_array(a, n, m);
					System.out.print("\n");
					System.out.print("NHAN t/T DE TIEP TUC HOAC PHIM BAT KY DE THOAT RA MENU: ");
					t = input.next().charAt(0);
					if(t == 't' || t == 'T') cont_con1 = true;
					else cont_con1 = false;
				} while(cont_con1 == true);
			}
			
	public static void menu7(int key, boolean cont_con) {
		Scanner input = new Scanner(System.in);
		boolean cont_con1 = false;
		char z1 = 0;
		
		do {
			do {
				System.out.println("a. CAC SO TU NHIEN <=N VA TONG CUA CHUNG");
				System.out.println("b. CAC SO TU NHIEN CHAN <=N VA TONG CUA CHUNG");
				System.out.println("c. CAC SO TU NHIEN LE <=N VA TONG CUA CHUNG");
				System.out.println("d. CAC SO TU NHIEN LA SO NGUYEN TO <=N VA TONG CUA CHUNG");
				System.out.println("e. N SO NGUYEN TO DAU TIEN");
				System.out.println("f. THOAT RA MENU CHINH");
				System.out.print("NHAP CHON: ");
				z1 = input.next().charAt(0);
			} while(z1 <'a' || z1 >'f');
			
			switch(z1) {
			case 'a':
				menu7_a(z1, cont_con1);
				break;
			case 'b':
				menu7_b(z1, cont_con1);
				break;
			case 'c':
				menu7_c(z1, cont_con1);
				break;
			case 'd':
				menu7_d(z1, cont_con1);
				break;
			case 'e':
				menu7_e(z1, cont_con1);
				break;
			default:
				cont_con1 = true;
				break;
			}
			
		}while(cont_con1 == false);
		
		switch(z1) {
		case 'f':
			cont_con = false;
			cont_con1 = true;
			break;
		}
		
	}
	
	
	
	public static void menu8(int key, boolean cont_con) {
		Scanner input = new Scanner(System.in);
		
		int[] b = new int[100];
		boolean cont_con1 = false;
		boolean cont = true;
		char z1 = 0;
		
		do {
			do {
				System.out.println("a. CAC PHAN TU CUA MANG A VA TONG CUA CHUNG");
				System.out.println("b. CAC PHAN TU CHAN CUA MANG A VA TONG CUA CHUNG");
				System.out.println("c. CAC PHAN TU LE CUA MANG A VA TONG CUA CHUNG");
				System.out.println("d. CAC PHAN TU LA SO NGUYEN TO CUA MANG A VA TONG CUA CHUNG");
				System.out.println("e. THEM 1 PHAN TU MOI VAO MANG A");
				System.out.println("f. XOA PHAN TU THU K CUA MANG A");
				System.out.println("g. NHAP 1 SO X, KIEM TRA X CO TRONG MANG A KHONG, NEU CO TRA VE VI TRI CUA X TRONG MANG A");
				System.out.println("h. THOAT RA MENU CHINH");
				System.out.print("NHAP CHON: ");
			z1 = input.next().charAt(0);
			}while(z1 <'a' || z1 >'h');
			
			switch(z1) {
			case 'a':
				menu8_a(z1, b, cont_con1);
				break;
			case 'b':
				menu8_b(z1, b, cont_con1);
				break;
			case 'c':
				menu8_c(z1, b, cont_con1);
				break;
			case 'd':
				menu8_d(z1, b, cont_con1);
				break;
			case 'e':
				menu8_e(z1, b,  cont_con1);
				break;
			case 'f':
				menu8_f(z1, b, cont_con1);
				break;
			case 'g':
				menu8_g(z1, b, cont_con1);
				break;
			default:
				cont_con1 = true;
				break;
			}
			
		}while(cont_con1 == false);
		switch(z1) {
		case 'h':
			cont_con = true;
			cont_con1 = false;
		break;
		}
	}
	
	public static void menu9(int key, boolean cont_con) {
		Scanner input = new Scanner(System.in);
		
		boolean cont_con1 = false;
		boolean cont = true;
		String s = null;
		char z1 = 0;
		
		do {
			do {
				System.out.println("a. DO DAI CUA S");
				System.out.println("b. XOA BO KHOANG TRANG THUA CUA S");
				System.out.println("c. DEM SO TU CUA S VA XUAT MOI TU NAM TREN 1 DONG");
				System.out.println("d. NHAP SO TU NHIEN K, XUAT K KY TU BEN TRAI CUA S, KI TU BEN PHAI CUA S");
				System.out.println("e. NHAP SO TU NHIEN K, N, XUAT N KI TU CUA S KE TU VI TRI K");
				System.out.println("f. THOAT RA MENU CHINH");
				System.out.print("NHAP CHON: ");
				z1 = input.next().charAt(0);
			} while(z1 <'a' || z1 >'f');
			
			switch(z1) {
			case 'a':
				menu9_a(z1, s, cont_con1);
				break;
			case 'b':
				menu9_b(z1, s, cont_con1);
				break;
			case 'c':
				menu9_c(z1, s, cont_con1);
				break;
			case 'd':
				menu9_d(z1, s, cont_con1);
				break;
			case 'e':
				menu9_e(z1, s, cont_con1);
				break;
			default:
				cont_con1 = true;
				break;
			}
			
		}while(cont_con1 == false);
		
		switch(z1) {
		case 'f':
				cont_con = true;
				cont_con1 = false;
			break;
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean cont = true;
		int key = 0;
		do {
			do {
				System.out.print("---------------------------------------------MENU----------------------------------------\n");
				System.out.print("--1. NHAP 2 SO NGUYEN, XUAT TONG, HIEU, TICH, THUONG                                  ---\n");
				System.out.print("--2. NHAP CHIEU DAI, CHIEU RONG CUA HINH CHU NHAT, XUAT CHU VI, DIEN TICH             ---\n");
				System.out.print("--3. NHAP BAN KINH HINH TRON, XUAT CHU VI, DIEN TICH                                  ---\n");
				System.out.print("--4. NHAP SO NGUYEN N, KIEM TRA VA XUAT KET QUA N LA SO CHAN/LE                       ---\n");
				System.out.print("--5. NHAP SO NGUYEN N, KIEM TRA VA XUAT KET QUA N LA SO AM/ZERO/DUONG                 ---\n");
				System.out.print("--6. NHAP SO NGUYEN N, KIEM TRA VA XUAT KET QUA N LA SO NGUYEN TO HAY KHONG           ---\n");
				System.out.print("--7. NHAP SO TU NHIEN N, XUAT RA KET QUA:                                             ---\n");
				System.out.print("--8. NHAP SO TU NHIEN N, NHAP N PHAN TU CUA MANG A, XUAT KET QUA:                     ---\n");
				System.out.print("--9. NHAP CHUOI S, XUAT KET QUA:                                                      ---\n");
				System.out.print("--0. KET THUC                                                                         ---\n");
				System.out.print("-----------------------------------------------------------------------------------------\n");;
				System.out.print("NHAP CHON: ");
				String a = input.nextLine();
				key = isTrue(a);
			} while(key < 0 || key > 9);
			switch(key) {
			case 1:
				menu1(key, cont);				
				break;
			case 2:
				menu2(key, cont);
				break;
			case 3:
				menu3(key, cont);
				break;
			case 4:
				menu4(key, cont);
				break;
			case 5:
				menu5(key, cont);
				break;
			case 6:
				menu6(key, cont);
				break;
			case 7:
				menu7(key, cont);
				break;
			case 8:
				menu8(key, cont);
				break;
			case 9:
				menu9(key, cont);
				break;
			case 0:			
				System.out.print("DUNG CHUONG TRINH...");
				cont = false;
				break;
			default:
				cont = false;
				break;
			}
	
		}while(cont == true);
	}
}