import { useState } from 'react';
import './styles.css';
import logo from '../../assets/img/logo.svg';


function Header() {
  return(
    <>
      <header>
          <div className="dsmeta-logo-container">
              <img src={logo} alt="AdrianoMenezes" />
              <h1>DSMeta</h1>
              <p>
                Desenvolvido por
                <a href="https://www.instagram.com/aaanm">@adrianomenezes</a>
              </p>
          </div>
      </header>
    </>
  )
}

export default Header;
