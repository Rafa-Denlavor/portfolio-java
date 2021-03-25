package basicLevel.Exercice.ExerciceSixteen;

public class rosto {

    public static void main(String[] args) {
	
//		Exemplo 1:
        String desenhoRosto[] = new String[5];
        
        desenhoRosto[0] = " + \"\" \"\"\"+";
        desenhoRosto[1] = "[|  o o  |]";
        desenhoRosto[2] = " |   ^   | ";
        desenhoRosto[3] = " |  '-'  | ";
        desenhoRosto[4] = " + ----- + ";
        
        for(int i = 0; i < desenhoRosto.length; i++) {
            System.out.println(desenhoRosto[i]);
        }
        
//		Exemplo 2:
//		System.out.println(" + \"\" \"\"\"+");
//		System.out.println("[|  o o  |]");
//		System.out.println(" |   ^   | ");
//		System.out.println(" |  '-'  | ");
//		System.out.println(" + ----- + ");
    }
}
        