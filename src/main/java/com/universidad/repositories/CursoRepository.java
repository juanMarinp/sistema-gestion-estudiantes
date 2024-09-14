@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {

    @Query("SELECT c FROM Curso c JOIN c.estudiantes e WHERE e.id = :estudianteId")
    List<Curso> findCursosByEstudianteId(@Param("estudianteId") Long estudianteId);
}
