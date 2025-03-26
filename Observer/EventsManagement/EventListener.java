/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer.EventsManagement;

/**
 *
 * @author shehriyar khan
 */
import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}
