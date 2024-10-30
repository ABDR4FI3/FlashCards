import os

# Paths
entities_path = r'C:\Users\Elgue\Documents\Last Semester\FlashCards\Spring\FlashcardsBackend\src\main\java\org\example\flashcardsbackend\entities'
repositories_path = r'C:\Users\Elgue\Documents\Last Semester\FlashCards\Spring\FlashcardsBackend\src\main\java\org\example\flashcardsbackend\repositories'

# List of entity classes
entity_classes = [f for f in os.listdir(entities_path) if f.endswith('.java')]

# Create repository interfaces
for entity in entity_classes:
    entity_name = entity[:-5]  # Remove the '.java' extension
    repository_name = f"{entity_name}Repository.java"
    
    repository_content = f"""package org.example.flashcardsbackend.repositories;

import org.example.flashcardsbackend.entities.{entity_name};
import org.springframework.data.jpa.repository.JpaRepository;

public interface {repository_name[:-5]} extends JpaRepository<{entity_name}, Long> {{
}}
"""

    # Write the repository interface to a new file
    with open(os.path.join(repositories_path, repository_name), 'w') as file:
        file.write(repository_content)
    
    print(f"Created: {repository_name}")

print("All repository interfaces created.")
