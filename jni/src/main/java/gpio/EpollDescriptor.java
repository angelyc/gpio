package gpio;

/**
 * Descriptor for epoll.
 * @author Koert Zeilstra
 */
public class EpollDescriptor {

    private int epFd;

    public EpollDescriptor(final String fileName) {
        epFd = createEpFd();
        System.out.println("epFd: " + epFd);
        addFile(epFd, fileName);
    }

    public void waitForEvent() {
        epollWait(epFd);
    }

    private native int createEpFd();

    private native void addFile(final int epFd, final String fileName);

    private native void epollWait(final int epFd);

}