# Add content to the file
@"
public interface CommandInterface {
    void execute();
    void undo();
    String getStatus();
}
"@ | Out-File -FilePath CommandInterface.java