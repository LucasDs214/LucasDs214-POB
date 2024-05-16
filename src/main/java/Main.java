public class Main 
{
  public static void main(String[] args) 
  {
    Cliente cliente = new Cliente();

    cliente.setCpf("162.925.372-14");

    System.out.println("CPF cliente: " + cliente.getCpf());
  }
}