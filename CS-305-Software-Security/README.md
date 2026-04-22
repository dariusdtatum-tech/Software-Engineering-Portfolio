# CS-305 – Software Security

This section contains artifacts focused on secure software development, including HTTPS implementation, SHA-256 hashing, and vulnerability analysis using OWASP Dependency-Check.
---

## Module 8 Reflection Responses

**Client Summary – Artemis Financial**

Artemis Financial is a company that required a more secure software system to protect sensitive financial data. The primary issue was ensuring secure communication and identifying vulnerabilities within the application. The goal was to implement encryption, verify data integrity, and reduce security risks within the system.

**What I Did Well / Importance of Secure Coding**

I did well in identifying vulnerabilities and applying practical solutions such as enabling HTTPS and implementing SHA-256 hashing. Secure coding is important because it protects sensitive data, prevents unauthorized access, and reduces the risk of exploitation. Strong security practices improve a company’s reliability and help maintain user trust.

**Challenging or Helpful Aspects**

One of the most helpful aspects was using OWASP Dependency-Check to identify vulnerabilities in external libraries. It showed how risks can exist outside of the application’s core code. Interpreting vulnerability reports and deciding which issues to prioritize was challenging but valuable for understanding real-world security analysis.

**How I Increased Layers of Security**

I increased security by implementing HTTPS for encrypted communication, using SHA-256 hashing for data integrity, and addressing vulnerabilities identified through dependency scanning. In the future, I would continue using tools like OWASP Dependency-Check, along with secure coding practices and regular vulnerability assessments, to determine appropriate mitigation strategies.

**Ensuring Functionality and Security**

After refactoring the code, I tested the application to ensure it still functioned correctly while maintaining security improvements. I verified secure endpoints, confirmed hashing output, and reran vulnerability scans to check that no new issues were introduced.

**Resources, Tools, and Practices Used**

I used Java’s MessageDigest for hashing, HTTPS configuration for secure communication, and OWASP Dependency-Check for vulnerability analysis. Secure coding practices such as input validation, dependency management, and risk assessment were also important throughout the project.

**What I Would Show Future Employers**

This assignment demonstrates my ability to identify vulnerabilities, implement secure solutions, and analyze risk within a software system. It highlights my understanding of secure development practices and my ability to apply them in a practical environment.
