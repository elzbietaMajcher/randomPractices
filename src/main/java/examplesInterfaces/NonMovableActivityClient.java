package examplesInterfaces;

public interface NonMovableActivityClient extends ActivityClient {

    // this interface extends other one, and just have inside external interface methods

    void onUseRequested(); // it is a new method

}
