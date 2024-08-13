package dkcorp.caselab_test_task.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "files")
public class FileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    @Column(name = "file_data", nullable = false, columnDefinition = "BYTEA")
    private byte[] fileData;

    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "creation_date", nullable = false)
    private LocalDateTime creationDate;

    @Column(name = "description", length = 500)
    private String description;
}
