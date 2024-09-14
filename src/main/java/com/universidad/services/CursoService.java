@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public List<Curso> listarCursos() {
        return cursoRepository.findAll();
    }

    public Curso guardarCurso(Curso curso) {
        return cursoRepository.save(curso);
    }
}
