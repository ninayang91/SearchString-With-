
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//int[] a={15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14};
		//System.out.println(search(a,1,0,a.length-1));
		String[] a={"at","","","","ball","","","car","","","dad","",""};
		System.out.println(searchR(a,"at",0,a.length-1));

	}
	
	public static int search(String[] a, String x, int low, int high){
		if(low>high)return -1;
		int mid=(low+high)/2;
		if(a[mid].compareTo(x)==0) return mid;
		if(a[mid]==""){
			int left= search(a,x,low,mid-1);
			int right=search(a,x,mid+1,high);
			return (left==-1)?right:left;
		}
		
		if(a[mid].compareTo(x)>0){
			return search(a,x,low,mid-1);
		}else{
			return search(a,x,mid+1,high);
		}
		
	}
	
	public static int serachR(String[] a, String x){
		if(a==null || x==null || x=="")return -1;
		return searchR(a,x,0,a.length-1);
	}
	public static int searchR(String[] a, String x, int low, int high){
		if(low>high)return -1;
		int mid=(low+high)/2;
		
		if(a[mid].compareTo("")==0){
			int left=mid-1,right=mid+1;
			while(true){
				if(left<low && right>high){
					return -1;
				}else if(left>=low && a[left].compareTo("")!=0){
					mid=left;
					break;
				}else if(right<=high && a[right].compareTo("")!=0){
					mid=right;
					break;
				}
				left--;
				right++;
			}
		}
		
		if(a[mid].compareTo(x)==0){
			return mid;
		}else if(a[mid].compareTo(x)>0){
			return search(a,x,low,mid-1);
		}else{
			return search(a,x,mid+1,high);
		}
	}


}
