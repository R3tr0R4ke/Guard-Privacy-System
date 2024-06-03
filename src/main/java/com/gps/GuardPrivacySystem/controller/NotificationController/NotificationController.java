package com.gps.GuardPrivacySystem.controller.NotificationController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.gps.GuardPrivacySystem.model.NotificationManager.Notification;
//import com.gps.GuardPrivacySystem.model.PKBmanager.PKBSystem;
import com.gps.GuardPrivacySystem.repository.NotificationRepository;

@RestController
@RequestMapping("api/notification")
public class NotificationController {

	@Autowired
	private NotificationRepository notificationRepository;
	
	//Operazioni CRUD:
		@GetMapping
		public List<Notification> getAllNotifications(){
			return notificationRepository.findAll();
		}
		
		@PostMapping
		public Notification createNotification(@RequestBody Notification notification) {
			return notificationRepository.save(notification);
		}
		
		@GetMapping("/{id}")
		public ResponseEntity<Notification> getNotificationById(@PathVariable Integer id){
			return notificationRepository.findById(id)
					.map(notification -> ResponseEntity.ok().body(notification))
					.orElse(ResponseEntity.notFound().build());
		}
		
		@PutMapping("/{id}")
		public ResponseEntity<Notification> updateNotification(@PathVariable Integer id, @RequestBody Notification notificationDetails){
			return notificationRepository.findById(id)
					.map(notification -> {
						notification.setMessage(notification.getMessage());
						notification.setUserManagement(notification.getUserManagement());
						Notification updateNotification = notificationRepository.save(notification);
						return ResponseEntity.ok().body(updateNotification);
					})
					.orElse(ResponseEntity.notFound().build());
		}
		
		@DeleteMapping("/{id}")
		public ResponseEntity<?> deleteNotification(@PathVariable Integer id){
			return notificationRepository.findById(id)
					.map(notification -> {
						notificationRepository.delete(notification);
						return ResponseEntity.ok().build();
					})
					.orElse(ResponseEntity.notFound().build());
		}
		
		/*public void sendNotification(user_id, message) {
			
		}*/
		
		/*public void getNotifications(user_id) {
			
		}*/
}
