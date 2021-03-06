public class TestDeadlockExample1 {  
    public static void main(String[] args) {  
      final String resource1 = "Imran khan";  
      final String resource2 = "tohid ali";  
    //   2.// t1 tries to lock resource1 then resource2  
      Thread t1 = new Thread() {  
        public void run() {  
            synchronized (resource1) {  
             System.out.println("Thread 1: locked resource 1");  
    
             try { Thread.sleep(100);} catch (Exception e) {}  
    
             synchronized (resource2) {  
              System.out.println("Thread 1: locked resource 2");  
             }  
           }  
        }  
      };  
    
      // t2 tries to lock resource2 then resource1  
      Thread t2 = new Thread() {  
        public void run() {  
          synchronized (resource2) {  
            System.out.println("Thread 2: locked resource 2");  
    
            try { Thread.sleep(100);} catch (Exception e) {}  
    
            synchronized (resource1) {  
              System.out.println("Thread 2: locked resource 1");  
            }  
          }  
        }  
      };  
    
        
      t1.start();  
      t2.start();  
    }  
  }       
  
  
//   1.Avoid Nested Locks: A deadlock mainly happens when we give locks to multiple threads. Avoid giving a lock to multiple threads if we already have given to one.
//   2.Avoid Unnecessary Locks: We can have a lock only those members which are required. ...
//   3.Using Thread.
  
//   wait() method -
//   1. The wait() method is used for interthread communication
//   2. The wait() method is tightly integrated with the synchronization lock.
//   3.wait() method, the thread goes in waiting state and it won’t come back automatically until we call the notify() or notifyAll()
  
  
//   notify() method
  
//   1.The java.lang.Object.notify() wakes up a single thread that is waiting on this object's monitor.
//   2.syntex public final void notify().
//   3.This method should only be called by a thread that is the owner of this object's monitor
//   4.This method does not return a value.
//   5.IllegalMonitorStateException − if the current thread is not the owner of this object's monitor.