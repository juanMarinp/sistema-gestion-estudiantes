@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {

    @Query("SELECT e FROM Estudiante e JOIN e.cursos c WHERE c.id = :cursoId")
    List<Estudiante> findEstudiantesByCursoId(@Param("cursoId") Long cursoId);

    @Modifying
    @Query("UPDATE Estudiante e SET e.edad = :nuevaEdad WHERE :curso MEMBER OF e.cursos")
    void actualizarEdadPorCurso(@Param("curso") Curso curso, @Param("nuevaEdad") int nuevaEdad);
}
