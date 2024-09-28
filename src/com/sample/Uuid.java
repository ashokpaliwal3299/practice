package com.sample;

import java.util.UUID;

public class Uuid {

	public static void main(String[] args) {
		UUID uuid = UUID.randomUUID();
		System.out.println("Generated UUID: " + uuid);

		// Convert a UUID to a string
		String uuidString = uuid.toString();
		System.out.println("UUID String: " + uuidString);

		// Create a UUID from a string
		UUID uuidFromString = UUID.fromString(uuidString);
		System.out.println("UUID from String: " + uuidFromString);

		// Check equality
		boolean isEqual = uuid.equals(uuidFromString);
		System.out.println("UUIDs are equal: " + isEqual);
	}
}
