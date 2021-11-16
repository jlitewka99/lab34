class OwnExc extends Exception
{
    // Parameterless Constructor
    public OwnExc() {}

    // Constructor that accepts a message
    public OwnExc(String message)
    {
        super(message);
    }
}