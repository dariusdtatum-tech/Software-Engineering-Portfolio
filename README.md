# Software Engineering Portfolio

This repository presents selected engineering artifacts demonstrating applied software development, system design, structured analysis, and quality assurance practices. The work reflects a disciplined approach to building reliable, maintainable, and user-centered systems.

## Portfolio Scope

The portfolio includes:

- **System Design Artifacts**  
  Architecture diagrams, technical specifications, and modeling documents illustrating structured system decomposition and implementation strategy.

- **Application Development Work**  
  Source code, prototypes, and modular implementations emphasizing clarity, maintainability, and defensive programming principles.

- **Problem-Solving and Analytical Work**  
  Coursework and independent exercises highlighting requirements interpretation, logical decomposition, and solution validation.

## Core Competencies

- Object-oriented design and implementation  
- UML modeling and system documentation  
- Requirements analysis and traceability  
- Structured testing and validation methodologies  
- Web application fundamentals  
- Version control using Git and GitHub  

## Portfolio Intent

This repository functions as an evolving record of technical growth and engineering discipline. Artifacts are curated to reflect analytical rigor, structured design thinking, and sustained attention to software quality attributes.

---
## CS 255 – DriverPass System Reflection

The DriverPass project centered on designing a system for a driving school that needed a structured way to manage students, instructors, vehicles, and lesson scheduling. The system was designed as a web-based platform where students can register, schedule lessons, manage their accounts, and recover access when needed, while administrators maintain control over scheduling, users, and system data.

One thing I did well in this project was turning user needs into concrete, usable documentation. The business requirements document clearly defined what the system had to do, and the system design document translated those needs into diagrams and workflows that made the logic easy to follow. Using UML diagrams helped keep the system grounded in real user actions instead of abstract features.

If I were to revise one part of the work, I would expand more on edge cases and future growth—things like scheduling conflicts during peak times or supporting multiple locations. The core design works, but tightening those areas would make the system more resilient and easier to scale.

User needs drove nearly every design decision. The focus was always on clarity and efficiency, especially for common actions like booking lessons or resetting a password. A system can be technically correct and still fail if it frustrates users, so keeping the design straightforward and predictable was a priority throughout the project.

My approach to designing software is methodical: understand the problem, define requirements clearly, then model the system before thinking about implementation. Breaking the system into diagrams and workflows made gaps easier to spot early and reduced guesswork later. This is the same approach I plan to carry forward—clear requirements, visual validation, and designs that make sense before a single line of code is written.

---

## CS 320 – Software Testing & Automation Reflection

This course strengthened my understanding that software quality is not accidental; it is engineered through deliberate verification and disciplined validation. In Project One, I developed unit tests using JUnit 5 to ensure that the Contact and ContactService classes adhered strictly to defined requirements. Each constraint—such as length limitations, null protection, and date validation—was treated as a non-negotiable constraint. Rather than testing only expected inputs, I focused heavily on invalid paths and boundary conditions to confirm that improper data was rejected predictably and securely. Achieving strong code coverage was not simply about meeting a metric threshold; it was about ensuring that each logical branch was exercised and that defensive safeguards behaved as intended.

Interpreting user needs required translating abstract requirements into enforceable program rules. Clear specifications became concrete validation logic, and each requirement was mapped to at least one corresponding test case. This traceability ensured that functionality aligned with stakeholder expectations while reducing ambiguity during implementation. Through this process, I came to view testing not as a final checkpoint, but as an analytical framework that informs design decisions from the outset.

My design approach has become increasingly methodical and risk-aware. I begin by analyzing constraints, identifying potential failure points, and structuring classes with separation of concerns in mind. Writing tests alongside implementation sharpened my attention to edge cases and reinforced the importance of maintainable, modular code. The discipline of structured testing, automated execution, and iterative refinement has reshaped how I evaluate software quality—prioritizing reliability, clarity, and long-term maintainability over superficial correctness.

---

## CS 305 – Software Security Reflection

This course focused on applying secure software development practices and understanding how vulnerabilities impact real-world systems. Through projects, I implemented HTTPS communication, generated SHA-256 hashes to verify data integrity, and used OWASP Dependency-Check to identify and analyze known vulnerabilities in project dependencies.

One of the most important takeaways was recognizing that security must be built into software from the start rather than added later. I approached vulnerability analysis by identifying risks, evaluating their impact, and applying mitigation strategies such as dependency updates, secure configurations, and input validation.

Refactoring the application to support HTTPS and secure hashing reinforced the importance of protecting data in transit and ensuring data integrity. Running dependency scans also highlighted how external libraries can introduce risk, even when the application code itself is correct.

This experience strengthened my ability to think from a security-first perspective—considering potential attack surfaces, validating inputs, and ensuring that software remains both functional and resilient against threats.
