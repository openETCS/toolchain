FIGDIR=images
SOURCE=.
TEMPLATE=$(HOME)/OpenETCS/ecosystem/openETCS_LateX_templates/template

SRC=definition.tex intro.tex  req_handle.tex soft_phase.tex
IMG=$(wildcard $(FIGDIR)/*.pdf)
BIB=wp7_bibliography.bib
GLOSS= wp7_glossary.tex
MAIN=WP7-Toolchain_architecture


all : $(MAIN).pdf 
$(MAIN).pdf : $(MAIN).aux $(MAIN).gls  $(MAIN).blg
	pdflatex $(MAIN).tex
	pdflatex $(MAIN).tex

$(MAIN).aux : $(MAIN).tex $(SRC) $(BIB) $(IMG)
	pdflatex $(MAIN).tex

$(MAIN).gls : $(GLO) $(MAIN).glo
	makeglossaries $(MAIN)

$(MAIN).blg: $(MAIN).aux 	
	bibtex $< 


.PHONY: .mproper clean
clean :
	rm  $(MAIN).aux *.log *.out

mrproper : clean
	rm $(MAIN).pdf  *.bbl *.blg *.toc *.lof *.lot *.gls *.glg *.glo *.ist
