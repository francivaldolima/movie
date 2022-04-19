import { ReactComponent as GithubIcon } from "assets/img/github.svg";
import { ReactComponent as LinkedinIcon } from "assets/img/linkedin.svg";
import './styles.css';

function Navbar() {
  return (
    <header>
      <nav className="container">
        <div className="dsmovie-nav-content">
          <h1>Movie</h1>
          <a href="https://github.com/francivaldolima">
            <div className="dsmovie-contact-container">
              <GithubIcon />
              <p className="dsmovie-contact-link">/francivaldolima</p>
            </div>
          </a>

          <a href="https://www.linkedin.com/in/francivaldolima">
            <div className="dsmovie-contact-container">
              <LinkedinIcon />
              <p className="dsmovie-contact-link">/francivaldolima</p>
            </div>
          </a>
        </div>
      </nav>
    </header>
  );
}

export default Navbar;
